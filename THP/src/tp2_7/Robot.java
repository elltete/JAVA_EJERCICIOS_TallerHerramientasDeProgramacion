package tp2_7;


public class Robot {

	final static String SALUDO1 = "Hola, mi nombre es ";
	final static String SALUDO2 = ". ¿En qué puedo ayudarte?";
	final static String SALUDO3 = "Hola ";
	final static String SALUDO4 = ", mi nombre es ";
	
	private String nombreRobot;
	
	public Robot(String nombreRobot) {
		this.nombreRobot = nombreRobot;
	}

	public void saludar() {
		System.out.println(SALUDO1 + nombreRobot + SALUDO2);
	}
	
	public void saludar(Persona persona) {
		System.out.println(SALUDO3 + persona.getNombrePersona() + SALUDO4 + nombreRobot + SALUDO2);
	}
	
}