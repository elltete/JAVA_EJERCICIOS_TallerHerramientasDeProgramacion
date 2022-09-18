package tp2_11;

public class test {

	public static void main(String[] args) {

		Superheroe s1 = new Superheroe("Batman",90,70,0);
		Superheroe s2 = new Superheroe("Superman",95,60,70);		

		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.competir(s2));
		System.out.println(s2.competir(s1));
		
	}

}
