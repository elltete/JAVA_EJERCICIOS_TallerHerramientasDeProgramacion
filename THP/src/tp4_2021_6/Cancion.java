package tp4_2021_6;

public class Cancion {
	
	final static int DIAS = 7;

	private String nombre;
	private String autor;
	private GeneroMusical genero;
	private int cantEscuchas = 0;
	private int diasDePublicacion = DIAS;
	
	public Cancion(String nombre, String autor, GeneroMusical genero) {
		this.nombre = nombre;
		this.autor = autor;
		this.genero = genero;
	}
	
	public void actualizarContador() {
		cantEscuchas++;
	}
	
	public boolean esRestringida() {
		boolean salida = false;
		if(superaDiasDePublicacion() || superaCantEscuchada()) {
			salida = true;			
		}
		return salida;
	}
	
	private boolean superaDiasDePublicacion() {
		boolean salida = false;
		if(this.diasDePublicacion > 7) {
			salida = true;
		}
		return salida;
	}
	
	public boolean superaCantEscuchada() {
		boolean salida = false;
		if(this.cantEscuchas > 1000 ) {
			salida = true;
		}
		return salida;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getAutor() {
		return autor;
	}

	public void listado() {
		System.out.println("Cancion " + nombre + ", autor=" + autor + ", genero=" + genero);
	}
	
	
}
