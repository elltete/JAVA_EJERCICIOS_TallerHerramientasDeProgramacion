package tp4_2021_9;

public class Candidato {
	
	private String nombre;
	private String email;
	
	public Candidato(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Candidato [nombre=" + nombre + ", email=" + email + "]";
	}

}
