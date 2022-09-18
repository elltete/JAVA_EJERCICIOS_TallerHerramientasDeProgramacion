package tp2_5;

public class test {

	public static void main(String[] args) {

		Automovil auto2 = new Automovil("Ford","Fiesta", "ABCD123", 40);	
		
		auto2.setRendimientoPorLitro(10);
		
		auto2.setCantDeCombustible(20);
		
		auto2.cargarCombustible(20);
		
		System.out.println(auto2.viajar(180));
		auto2.cargarCombustible(180);
		System.out.println(auto2.toString());

		System.out.println(auto2.viajar(50));
		auto2.cargarCombustible(50);
		System.out.println(auto2.toString());
		
		/*
		En la clase test, crear el objeto a través del constructor. "Ford","Fiesta", "ABCD123", capacidad
		tanque:40. Setear el rendimiento por litro en 10 y llenar el tanque con 20 (veinte) litros de combustible.
		Probar todos los métodos recorriendo 180 kilómetros primero e intentando recorrer 50 después,
		mostrando siempre la cantidad de kilómetros que devuelve viajar().
		 */
	}

}
