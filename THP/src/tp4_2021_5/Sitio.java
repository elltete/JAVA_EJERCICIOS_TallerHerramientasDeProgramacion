package tp4_2021_5;

import java.util.ArrayList;

public class Sitio {

	private String nombre;
	private ArrayList<Pelicula> arrayPeliculas;
	private ArrayList<Cliente> arrayClientes;
	private ArrayList<Cliente> arrayClientesListaNegra;

	public Sitio(String nombre) {
		this.nombre = nombre;
		this.arrayPeliculas = new ArrayList<Pelicula>();
		this.arrayClientes = new ArrayList<Cliente>();
		this.arrayClientesListaNegra = new ArrayList<Cliente>();
	}

	public StatusVer verPelicula(String dni, String peli) {
		StatusVer salida = StatusVer.OK;
		if(!esCliente(dni)){
			if (clienteEnListaNegra(dni)){
				salida = StatusVer.CLIENTE_DEUDOR;
			}else {
				salida = StatusVer.CLIENTE_INEXISTENTE;
			}
		}else if(clienteTieneDeuda(dni)) {
			salida = StatusVer.CLIENTE_DEUDOR;
		}else if(!peliculaExiste(peli)) {
			salida = StatusVer.CONTENIDO_INEXISTENTE;
		}else if(!peliculaDisponible(dni, peli)) {
			salida = StatusVer.CONTENIDO_NO_DISPONIBLE;
		}else {
			saberCliente(dni).agregarPeliculaVista(saberPelicula(peli));
		}
		return salida;
	}

	public boolean peliculaDisponible(String dni, String peli) {
		boolean salida = false;
		Servicio serv = saberPelicula(peli).queContenidoEs();
		if(serv == Servicio.STANDARD) {
			salida = true;
		} else if(saberCliente(dni).getTipo() == Servicio.PREMIUM) {
			salida = true;			
		}
		return salida;
	}
	
	public Pelicula saberPelicula(String peli) {
		Pelicula salida = null;
		int i=0;
		while(i<arrayPeliculas.size() && salida==null) {
			if(arrayPeliculas.get(i).getNombre().equals(peli)) {
				salida = arrayPeliculas.get(i);
			}else {
				i++;
			}
		}
		return salida;
	}	

	public boolean clienteTieneDeuda(String dni) {
		return saberCliente(dni).esDeudor();
	}

	public Cliente saberCliente(String dni) {
		Cliente salida = null;
		int i=0;
		while(i<arrayClientes.size() && salida==null) {
			if(arrayClientes.get(i).getDni().equals(dni)) {
				salida = arrayClientes.get(i);
			}else {
				i++;
			}
		}
		return salida;
	}

	public boolean peliculaExiste(String peli) {
		boolean salida = false;
		int i=0;
		while(i<arrayPeliculas.size() && !salida) {
			if(arrayPeliculas.get(i).getNombre().equals(peli)) {
				salida = true;
			}else {
				i++;
			}
		}
		return salida;
	}

	public boolean esCliente(String dni) {
		boolean salida = false;
		int i=0;
		while(i<arrayClientes.size() && !salida) {
			if(arrayClientes.get(i).getDni().equals(dni)) {
				salida = true;
			}else {
				i++;
			}
		}
		return salida;
	}

	public boolean clienteEnListaNegra(String dni) {
		boolean salida = false;
		int i=0;
		while(i<arrayClientesListaNegra.size() && !salida) {
			if(arrayClientesListaNegra.get(i).getDni().equals(dni)) {
				salida = true;
			}else {
				i++;
			}
		}
		return salida;
	}

	public void agregarPelicula(Pelicula peli) {
		this.arrayPeliculas.add(peli);
	}

	public StatusVer darDeBaja(String dni) {
		StatusVer salida = StatusVer.OK;
		if(!esCliente(dni)){
			if (clienteEnListaNegra(dni)){
				salida = StatusVer.CLIENTE_DEUDOR;
			}else {
				salida = StatusVer.CLIENTE_INEXISTENTE;
			}
		}else { 
			Cliente cli = saberCliente(dni);
			if(cli.getPrecio()>0) {
				salida = StatusVer.CLIENTE_DEUDOR;
				arrayClientes.remove(cli);
				arrayClientesListaNegra.add(cli);
			}else {
				arrayClientes.remove(cli);				
			}
		}
		return salida;
	}

	public StatusAlta darDeAlta(String dni, Servicio tipo) {
		StatusAlta salida = StatusAlta.ALTA_OK;
		if(clienteEnListaNegra(dni)) {
			salida = StatusAlta.CLIENTE_DEUDOR;
		}else if(esCliente(dni)) {
			salida = StatusAlta.CLIENTE_EXISTENTE;
		}else {
			Cliente cli = new Cliente(dni);
			cli.setTipo(tipo);
			arrayClientes.add(cli);
		}
			return salida;
	}
	
	public void setearPrecioCliente(String dni, double monto) {
		saberCliente(dni).setPrecio(monto);
	}
	
	public void listarClientesListaNegra() {
		for(Cliente c: arrayClientesListaNegra) {
				System.out.println(c.toString());
		}
	}
	
	public void listarClientes() {
		for(Cliente c: arrayClientes) {
				System.out.println(c.toString());
		}
	}
	
	public void listarPeliculas() {
		for(Pelicula p: arrayPeliculas) {
				System.out.println(p.toString());
		}
	}

	public void depurarListaNegra(double importe) {
		int i=0;
		while(i<arrayClientesListaNegra.size()) {
			Cliente cli = arrayClientesListaNegra.get(i);
			if(cli.getPrecio()<=importe) {
				arrayClientesListaNegra.remove(cli);
			}else {
				i++; //Es importante que incremente el i en el ELSE 
			}
		}
	}

}
