package tp2;

public class Test {
	
	public static void main(String[] args) {
		
		Persona unaPersona = new Persona();
		System.out.println("El nombre de la persona es " + unaPersona.getNombreCompleto());
		unaPersona.setNombre("Diego");
		unaPersona.setApellido("Ponzo");
		System.out.println("El nombre de la persona es " + unaPersona.getNombreCompleto());

		Persona otraPersona = new Persona("Ponzo", "Diego");
		System.out.println("El nombre de la persona es " + otraPersona.getNombreCompleto());

		Persona dosPersona = new Persona("Diego");
		System.out.println("El nombre de la persona es " + dosPersona.getNombreCompleto());

		Persona tresPersona = new Persona("","Ponzo");
		System.out.println("El nombre de la persona es " + tresPersona.getNombreCompleto());
		
		System.out.println(unaPersona.toString());
		System.out.println(otraPersona.toString());
		System.out.println(dosPersona);
		System.out.println(tresPersona);
	  
	}

}
