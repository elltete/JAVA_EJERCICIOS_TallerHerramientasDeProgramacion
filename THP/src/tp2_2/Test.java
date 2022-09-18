package tp2_2;

public class Test {

	public static void main(String[] args) {

		//LLAMADO A METODOS CONSTRUCTORES

		Persona pers1 = new Persona();
		Persona pers2 = new Persona("Diego", "Ponzo", "24030275");

		Computadora compu1 = new Computadora();
		Computadora compu2 = new Computadora("LENOVO");

		Procesador proc1 = new Procesador();
		Procesador proc2 = new Procesador("AMD", "P4", 96, 95);

		DVD dvd1 = new DVD();
		DVD dvd2 = new DVD("LG", true);

		//ASIGNACION DE OBJETOS PROCESADOR Y DVD AL OBJETO COMPUTADORA

		compu1.setProcesador(proc1);
		compu2.setProcesador(proc2);

		compu1.setDvd(dvd1);
		compu2.setDvd(dvd2);

		pers1.setComputadora(compu1);
		pers2.setComputadora(compu2);		

		System.out.println(pers1.toString());
		System.out.println(pers2.toString());

		//El DVD que tiene la compu de la persona 2, es grabable?

		if (dvd2.getGrabacion()) {
			System.out.println("GRABA");
		}else {
			System.out.println("NO GRABA");
		}

		if (pers2.getComputadora().getDVD().getGrabacion()) {
			System.out.println("GRABA");
		}else {
			System.out.println("NO GRABA");
		}

		//El micro que tiene la compu de la persona 1, tiene la temperatura Critica?
		
		if (pers2.getComputadora().getProcesador().informarCriticidad2()) {
			System.out.println("Temperatura Critica");
		}else {
			System.out.println("Temperatura Estable");
		}
		
		
		
	}

}
