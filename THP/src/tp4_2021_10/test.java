package tp4_2021_10;

public class test {

	public static void main(String[] args) {

		Empresa Correcaminos = new Empresa("Correcaminos");
		
		Carrera c1 = new Carrera(11, "20", Dificultad.PRINCIPIANTE);
		Carrera c2 = new Carrera(12, "21", Dificultad.AVANZANDO);
		Carrera c3 = new Carrera(13, "22", Dificultad.AS_DEL_VOLANTE);

		Correcaminos.agregarCarrera(c1);
		Correcaminos.agregarCarrera(c2);
		Correcaminos.agregarCarrera(c3);
		
		Piloto p1 = new Piloto("D", "1");
		Piloto p2 = new Piloto("I", "2");
		Piloto p3 = new Piloto("E", "3");
		Piloto p4 = new Piloto("G", "4");
		Piloto p5 = new Piloto("O", "5");
		
		c1.agregarPiloto(p1);
		c1.agregarPiloto(p2);
		c1.agregarPiloto(p3);
		c1.agregarPiloto(p4);
		c1.agregarPiloto(p5);
		c2.agregarPiloto(p1);
		c2.agregarPiloto(p2);
		c2.agregarPiloto(p3);
		c2.agregarPiloto(p4);
		c2.agregarPiloto(p5);
		c3.agregarPiloto(p1);
		c3.agregarPiloto(p2);
		c3.agregarPiloto(p3);
		c3.agregarPiloto(p4);
		c3.agregarPiloto(p5);
		
		p1.agregarVuelta(new Vuelta(30));
		p1.agregarVuelta(new Vuelta(33));
		p1.agregarVuelta(new Vuelta(40));
		p1.agregarVuelta(new Vuelta(10));
		p2.agregarVuelta(new Vuelta(10));
		p2.agregarVuelta(new Vuelta(33));
		p2.agregarVuelta(new Vuelta(40));
		p2.agregarVuelta(new Vuelta(10));
		p3.agregarVuelta(new Vuelta(30));
		p3.agregarVuelta(new Vuelta(33));
		p3.agregarVuelta(new Vuelta(40));
		p3.agregarVuelta(new Vuelta(10));
		p4.agregarVuelta(new Vuelta(30));
		p4.agregarVuelta(new Vuelta(33));
		p4.agregarVuelta(new Vuelta(40));
		p4.agregarVuelta(new Vuelta(10));
		p5.agregarVuelta(new Vuelta(30));
		p5.agregarVuelta(new Vuelta(33));
		p5.agregarVuelta(new Vuelta(40));
		p5.agregarVuelta(new Vuelta(10));
		
		Correcaminos.buscarCarrera("21").print();
		
		System.out.println(p2.calcularPromedio());
		
		System.out.println(c1.buscarPilotosPorDebajoDe(29));
		
		c1.mostrarMenorPromedio();
		
		System.out.println(Correcaminos.pilotosPorCarrera());
		
	}

}
