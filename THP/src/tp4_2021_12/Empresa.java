package tp4_2021_12;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private static int cantLegajosEmpleado = 0;
	private ArrayList<Empleado> arrayEmpleados;
	private ArrayList<Area> arrayAreas;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		arrayEmpleados = new ArrayList<Empleado>();
		arrayAreas = new ArrayList<Area>();
	}

	public void darAltaEmpleado(String nombre, String oficina) {
		if(buscarEmpleado(nombre) != null) {
			System.out.println("Empleado ya existe");
		}else {
			if(buscarOficina(oficina) == null) {
				System.out.println("Oficina no existe");
			}else {
				cantLegajosEmpleado++;
				arrayEmpleados.add(new Empleado(nombre, cantLegajosEmpleado, buscarOficina(oficina)));
				System.out.println("Empleado dado de alta");				
			}		
		}
	}
	
	private Empleado buscarEmpleado(String nombre) {
		Empleado empleado = null;
		int i = 0;
		while(i<arrayEmpleados.size() && empleado == null) {
			if(arrayEmpleados.get(i).getNombre().equals(nombre)) {
				empleado = arrayEmpleados.get(i);
			}else {
				i++;
			}
		}
		return empleado;
	}
	
	public void crearArea(String nombre) {
		if(buscarArea(nombre) == null) {
			arrayAreas.add(new Area(nombre));
			System.out.println("Area dada de alta");
		}else {
			System.out.println("Area ya existe");			
		}
	}
	
	private Area buscarArea(String nombre) {
		Area area = null;
		int i = 0;
		while(i<arrayAreas.size() && area == null) {
			if(arrayAreas.get(i).getNombre().equals(nombre)) {
				area = arrayAreas.get(i);
			}else {
				i++;
			}
		}
		return area;
	}
	
	public void crearOficina(String nombre, String area) {
		if(buscarArea(area) == null) {
			System.out.println("Area no existe");
		}else {
			if(buscarOficina(nombre) != null) {
				System.out.println("Oficina ya existe");
			}else {
				buscarArea(area).altaOficina(nombre, buscarArea(area));
				System.out.println("Oficina dada de alta");
			}
		}
		
	}
	
	private Oficina buscarOficina(String nombre) {
		Oficina oficina = null;
		int i = 0;
		while(i<arrayAreas.size() && oficina == null) {
			Oficina of = arrayAreas.get(i).existeOficina(nombre);
			if(of != null ) {
				oficina = of;
			}else {
				i++;
			}
		}
		return oficina;
	}
	
	
	
	public void listadoEmpleados() {
		for(Empleado e:arrayEmpleados) {
			System.out.println("Empleado: " + e.getNombre()
					+ ", legajo " + e.getLegajo()
					+ ", Area: " + e.getOficina().getArea().getNombre()
					+ ", Oficina: " + e.getOficina().getNombre());
		}
		
	}
}
