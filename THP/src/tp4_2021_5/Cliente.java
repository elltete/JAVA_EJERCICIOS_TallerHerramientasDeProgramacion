package tp4_2021_5;

import java.util.ArrayList;

public class Cliente {
	
	private String dni;
	private String nombre = "NN";
	private double precio = 0;
	private Servicio tipo = Servicio.STANDARD;
	private ArrayList<Pelicula> arrayPeliculasVistas; 
	
	public Cliente(String dni) {
		this.dni = dni;
		arrayPeliculasVistas = new ArrayList<Pelicula>();
	}
	
	public boolean esDeudor() {
		boolean deudor = false;
		if(this.precio>0) {
			deudor = true;
		}
		return deudor  ;
	}
	
	public void agregarPeliculaVista(Pelicula peli) {
		arrayPeliculasVistas.add(peli);
	}

	public String getDni() {
		return dni;
	}

	public double getPrecio() {
		return precio;
	}

	public Servicio getTipo() {
		return tipo;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setTipo(Servicio tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", precio=" + precio + ", tipo=" + tipo
				+ ", " + arrayPeliculasVistas + "]";
	}

	public void listarPeliculasVistas() {
		for(Pelicula p: arrayPeliculasVistas) {
				System.out.println(p.toString());
		}
	}
}
