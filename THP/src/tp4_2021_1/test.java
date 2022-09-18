package tp4_2021_1;

public class test {

	public static void main(String[] args) {

		Agenda ag = new Agenda();
		
		System.out.println(ag.sizeAgenda());
		ag.agregarPersona("23232323", "Diego", "Martin", "casa");
		ag.agregarPersona("23232324", "Diego", "Martin", "casa");
		ag.agregarPersona("23232325", "Diego", "Martin", "casa");
		System.out.println(ag.sizeAgenda());
		
		System.out.println(ag.devolverUltimo());
		
		ag.modificarDomicilio("23232323", "hogar");
		
		ag.removerPersona("23232325");
		
		ag.listarPersonas();
		
		ag.eliminarTodosElementosAMano();
		System.out.println(ag.sizeAgenda());

	}

}
