package tp4_2021_7;

public class Turno {
	
	private String dni;
	private boolean presencia = false;
	
	
	public Turno(String dni) {
		this.dni = dni;
	}
	
	public void actualizarPresencia() {
		this.presencia = true;
	}

	public String getDni() {
		return dni;
	}

	public boolean isPresencia() {
		return presencia;
	}

	public String listado() {
		return " [presencia= " + presencia + "]";
	}
	
	

}
