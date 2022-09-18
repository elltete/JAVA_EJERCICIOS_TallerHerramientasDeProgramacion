package tp4_2021_12;

public class Oficina {
	
	private String nombre;
	private Area area;
	
	public Oficina(String nombre, Area area) {
		this.nombre = nombre;
		this.area = area;
	}

	public String getNombre() {
		return nombre;
	}

	public Area getArea() {
		return area;
	}

}
