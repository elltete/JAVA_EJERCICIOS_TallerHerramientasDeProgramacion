package tp4_2021_12;

public class test {

	public static void main(String[] args) {

		Empresa citi = new Empresa ("Citi");
		
		citi.crearArea("Sistemas");
		citi.crearArea("RRHH");
		citi.crearArea("Operaciones");
		
		citi.crearOficina("IT", "Sistemas");
		citi.crearOficina("DB", "Sistemas");
		citi.crearOficina("Liquidacion", "RRHH");
		citi.crearOficina("Generalista", "RRHH");
		citi.crearOficina("Cajas", "Operaciones");
		citi.crearOficina("CallCenter", "Operaciones");
		
		citi.darAltaEmpleado("Diego", "IT");
		citi.darAltaEmpleado("Martin", "DB");
		citi.darAltaEmpleado("Francisco", "Liquidacion");
		citi.darAltaEmpleado("Ines", "Generalista");
		citi.darAltaEmpleado("Juan", "Cajas");
		citi.darAltaEmpleado("Jorge", "CallCenter");
		
		citi.listadoEmpleados();
		


	}

}
