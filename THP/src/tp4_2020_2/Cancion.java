package tp4_2020_2;

public class Cancion {
	
	private String tema = "";
	
	public Cancion(String tema) {
		this.tema = tema;
	}
	
	public String getTema() {
		return this.tema;
	}

	@Override
	public String toString() {
		return "Cancion [tema=" + tema + "]";
	} 
}
