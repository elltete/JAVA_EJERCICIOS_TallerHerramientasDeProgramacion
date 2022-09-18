package tp4_2021_13;

import java.util.ArrayList;

public class Empresa {
	
	private static int numeroLegajo = 0;
	private ArrayList<Empleado> empleados1;
	private ArrayList<Empleado> empleados2;
	
	public Empresa() {
		empleados1 = new ArrayList<Empleado>();
		empleados2 = new ArrayList<Empleado>();
	}
	
	public void altaEmpleado(int numero){
		numeroLegajo++;
		if(numero == 1) {
			empleados1.add(new Empleado(numeroLegajo));
		}else {
			empleados2.add(new Empleado(numeroLegajo));
		}
	}

	public void listarOrdenado(){
		int i = 0;
		int j = 0;
		while(i<empleados1.size() && j<empleados2.size()) {
			if(empleados1.get(i).getLegajo() < empleados2.get(j).getLegajo()) {
				System.out.println(empleados1.get(i).getLegajo());
				i++;
			}else {
				System.out.println(empleados2.get(j).getLegajo());
				j++;
			}
		}
	}

}
