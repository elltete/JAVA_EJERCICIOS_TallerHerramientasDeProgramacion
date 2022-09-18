package tp4_2021_2;

public class test {

	public static void main(String[] args) {

		Compania pepsi = new Compania("Pepsi");
		
		Area ventas = new Area("Ventas");
		pepsi.agregarArea(ventas);
		Area marketing = new Area("Marketing");
		pepsi.agregarArea(marketing);
		Area sistemas = new Area("Sistemas");
		pepsi.agregarArea(sistemas);
		
		Oficina of1 = new Oficina("Oficina 1");
		ventas.agregarOficina(of1);
		Oficina of2 = new Oficina("Oficina 2");
		ventas.agregarOficina(of2);
		Oficina of3 = new Oficina("Oficina 3");
		marketing.agregarOficina(of3);
		Oficina of4 = new Oficina("Oficina 4");
		marketing.agregarOficina(of4);
		Oficina of5 = new Oficina("Oficina 5");
		sistemas.agregarOficina(of5);
		Oficina of6 = new Oficina("Oficina 6");
		sistemas.agregarOficina(of6);
		
		of1.agregarPersona(new Persona("Juan"));
		of2.agregarPersona(new Persona("Pablo"));
		of3.agregarPersona(new Persona("Diego"));
		of4.agregarPersona(new Persona("Maria"));
		of5.agregarPersona(new Persona("Ana"));
		of6.agregarPersona(new Persona("Martin"));
		
		pepsi.listado();
		
	}

}
