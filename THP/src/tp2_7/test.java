package tp2_7;

public class test {

	public static void main(String[] args) {

		Robot robot1 = new Robot("ROBOTINO");
		Persona persona1 = new Persona("Diego");
		
		robot1.saludar();
		robot1.saludar(persona1);	

	}

}
