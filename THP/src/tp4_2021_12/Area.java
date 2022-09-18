package tp4_2021_12;

import java.util.ArrayList;

public class Area {
	
	private String nombre;
	private ArrayList<Oficina> arrayOficinas;
	
	public Area(String nombre) {
		this.nombre = nombre;
		arrayOficinas = new ArrayList<Oficina>();
	}

	public String getNombre() {
		return nombre;
	}
	
	public void altaOficina(String nombre, Area area) {
		arrayOficinas.add(new Oficina(nombre, area));
	}
		
	public Oficina existeOficina(String nombre){
		Oficina oficina = null;
		int i = 0;
		while(i<arrayOficinas.size() && oficina == null) {
			if(arrayOficinas.get(i).getNombre().equals(nombre)) {
				oficina = arrayOficinas.get(i);
			}else {
				i++;
			}
		}
		return oficina;
	}

}
