package tp4_2021_6;

import java.util.ArrayList;

public class Aplicacion {

	final static int MAX_CANCIONES_POR_DIA = 1;

	private String nombre;
	private ArrayList<Cancion> arrayCanciones;
	private ArrayList<Usuario> arrayUsuarios;

	public Aplicacion(String nombre) {
		this.nombre = nombre;
		arrayCanciones = new ArrayList<Cancion>();
		arrayUsuarios = new ArrayList<Usuario>();
	}	

	private Cancion buscarCancion(String nombre, String autor) { //*
		Cancion c = null;
		int i = 0;
		while(i<arrayCanciones.size() && c == null) {
			Cancion aux = arrayCanciones.get(i);
			if(aux.getNombre().equals(nombre) && aux.getAutor().equals(autor)) {
				c = aux;
			}else {
				i++;
			}
		}
		return c;
	}

	private Usuario buscarUsuario(String email) { //*
		Usuario u = null;
		int i = 0;
		while(i<arrayUsuarios.size() && u == null) {
			Usuario aux = arrayUsuarios.get(i);
			if(aux.getEmail().equals(email)) {
				u = aux;
			}else {
				i++;
			}
		}
		return u;
	}

	public boolean altaCancion(String nombre, String autor, GeneroMusical genero) { //*
		boolean salida = false;
		if (buscarCancion(nombre, autor) == null) {
			arrayCanciones.add(new Cancion(nombre, autor, genero));
			salida = true;
		}
		return salida;
	}

	public boolean altaUsuario(String email, String apellido, int edad) { //*
		boolean salida = false;
		if (buscarUsuario(email) == null) {
			arrayUsuarios.add(new Usuario(email, apellido, edad));
			salida = true;
		}
		return salida;		
	}

	public StatusEscuchar escucharCancion(String email, String nombre, String autor) { //*
		StatusEscuchar salida = StatusEscuchar.CANCION_ESCUCHADA;
		Cancion can = buscarCancion(nombre, autor);
		Usuario usr = buscarUsuario(email);
		if (can == null) {
			salida = StatusEscuchar.CANCION_INEXISTENTE;
		}else {
			if (usr == null) {
				salida = StatusEscuchar.USUARIO_INEXISTENTE;	
			}else {
				if (usr.getCategoria() == CategoriaUsuario.GRATUITO && usr.getCancionesPorDia() > MAX_CANCIONES_POR_DIA) {
					salida = StatusEscuchar.LIMITE_ALCANZADO;				
				}else {
					if (can.esRestringida()) {
						salida = StatusEscuchar.CANCION_NO_DISPONIBLE;	
					}else {
						usr.actualizarContador();
						can.actualizarContador();
						usr.agregarCancionEscuchada(can);
						}
					}
				}
			}

		return salida;
	}

	public void listarUsuarios() { //*
		for(Usuario u: arrayUsuarios) {
			u.listado();
		}
	}

	public void listarCancionesPorUsuario(String email) { //*
		Usuario user = buscarUsuario(email);
		if (user == null) {
			System.out.println("Usuario Inexistente");
		}else {
			user.listarCancionesEscuchadas();
		}
	}

	public void cambiarCategoria(String email, CategoriaUsuario categoria) {
		Usuario user = buscarUsuario(email);
		if (user == null) {
			System.out.println("Usuario Inexistente");
		}else {
			user.cambiarCategoria(categoria);
		}		
	}

}
