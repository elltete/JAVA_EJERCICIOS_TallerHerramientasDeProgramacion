package tp4_2021_6;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
	
	private String email;
	private String apellido;
	private int edad;
	private CategoriaUsuario categoria = CategoriaUsuario.GRATUITO;
	private int cancionesPorDia = 0;
	private ArrayList<Cancion> arrayCancionesEscuchadas;
	
	public Usuario(String email, String apellido, int edad) {
		this.email = email;
		this.apellido = apellido;
		this.edad = edad;
		arrayCancionesEscuchadas = new ArrayList<Cancion>();
	}
	
	public void actualizarContador() {
		cancionesPorDia++;
	}
	
	public void agregarCancionEscuchada(Cancion can) {
		arrayCancionesEscuchadas.add(can);
	}

	public void cambiarCategoria(CategoriaUsuario categoria) {
		this.categoria = categoria;
	}

	public String getEmail() {
		return email;
	}

	public CategoriaUsuario getCategoria() {
		return categoria;
	}

	public int getCancionesPorDia() {
		return cancionesPorDia;
	}

	public void listado() {
		System.out.println("Usuario " + email + ", categoria=" + categoria + ", Cant canciones escuchadas: " + arrayCancionesEscuchadas.size());
	}
	
	public void listarCancionesEscuchadas() {
		this.listado();
		for(Cancion c: arrayCancionesEscuchadas){
			c.listado();
		}
	}
	
}
