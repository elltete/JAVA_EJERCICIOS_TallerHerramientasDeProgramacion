package tp2_12;

public class Documento {
	
	private Fecha fecha;
	private String titulo;
	private String cuerpo;
	
	public Documento(int dia, int mes , int anio, String titulo, String cuerpo) {
		this.fecha = new Fecha(dia, mes, anio);
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}

	public Fecha getFecha() {
		return fecha;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getCuerpo() {
		return cuerpo;
	}
	
	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	
	
}
