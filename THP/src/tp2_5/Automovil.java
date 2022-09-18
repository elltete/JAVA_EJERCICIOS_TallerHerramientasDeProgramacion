package tp2_5;

public class Automovil {

	private String marca;
	private String modelo;	
	private String patente;
	private double capacidadTanque=MAX_TANQUE;
	private double cantDeCombustible=0; 
	private double rendimientoPorLitro=10;
	
	public static final double MAX_TANQUE = 50;

	public Automovil() {
		this.marca = "";
		this.modelo = "";
		this.patente = "";
	}
	// a. Constructor parametrizado: recibe marca, modelo, patente y la capacidad del tanque de combustible.
	
	public Automovil(String marca, String modelo, String patente, double capacidadTanque) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.setCapacidadTanque(capacidadTanque);
	}

	//b. Método privado calcularConsumo(): recibe la cantidad de kilómetros que se quiere recorrer y 
	//   devuelve un double indicando los litros de combustible necesarios según los kilómetros requeridos.

	private double calcularConsumo(double km) {
		double resultado = km/this.getRendimientoPorLitro();
		return resultado;
	}

	//c. Método privado calcularDistancia(): recibe la cantidad de litros quiere consumir y devuelve un
	//   double indicando los kilómetros que puede recorrer.

	private double calcularDistancia(double litros) {
		double resultado = litros*this.getRendimientoPorLitro();
		return resultado;
	}

	//d. Método privado consumirCombustible(): recibe la cantidad de litros que se quiere consumir y
	//   actualiza la cantidad combustible en el tanque. Devuelve un double indicando los litros faltantes si
	//   es que no le alcanza, consumirá lo que tiene.

	private double consumirCombustible(double litros) {
		double respuesta;
		if(this.getCantDeCombustible()<=litros) {
			respuesta = getCantDeCombustible()-litros;
			this.setCantDeCombustible(respuesta);
		}else {
			this.setCantDeCombustible(0);
			respuesta = litros-getCantDeCombustible();
		}
		return respuesta;
	}

	//e. Método público viajar(): recibe la cantidad de kilómetros que desea recorrer y devuelve la cantidad
	//   de kilómetros que efectivamente se realizaron con el combustible existente en el tanque
	//   actualizando la cantidad de combustible consumido. Ayudin….. Para realizar este método deberá
	//   valerse de los métodos anteriores.

	public double viajar(double km) {
		double resultado;
		double cantidad = this.getCantDeCombustible() - calcularConsumo(km);
		if(cantidad >=0) {
			this.setCantDeCombustible(cantidad);
			resultado = km;
		}else {
			resultado = calcularDistancia(this.cantDeCombustible);
			this.setCantDeCombustible(0);
		}		
		return resultado;
	}

	//f. Método público cargarCombustible(): recibe por parámetro la cantidad que se quiere cargar, que
	//   nunca debe ser menor o igual que cero o mayor al espacio disponible. Si puede, actualiza el atributo
	//   correspondiente. Devuelve true o false dependiendo del éxito de la acción.

	public boolean cargarCombustible(double litros) {
		boolean respuesta = false;
		if(litros<=0 || litros >= this.espacioDisponible()) {
			System.out.println("Ingreso un valor negativo o tanque sin capacidad.");
		}else {
			this.setCantDeCombustible(this.getCantDeCombustible()+litros);
			respuesta = true;
		}
		return respuesta;
	}

	//g. Método privado espacioDisponible(), que devuelve la diferencia entre el tamaño del tanque y los
	//   litros de combustible almacenados.

	private double espacioDisponible() {
		double valor;
		valor = (this.getCapacidadTanque()-this.getCantDeCombustible());
		return valor;
	}

	//h. Método público pocoCombustible(), que devuelve un valor booleano, indicando verdadero siempre
	//   que la cantidad de combustible sea menor al 15% de la capacidad del tanque.

	public boolean pocoCombustible() {
		boolean respuesta = false;
		if(this.getCantDeCombustible()/this.capacidadTanque<=0.15) {
			respuesta = true;
		}
		return respuesta;
	}

	//i. El método toString() que devolverá todos los valores de estado del objeto incluyendo	
	//   espacioDisponible() y pocoCombustible().

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", capacidadTanque="
				+ capacidadTanque + ", cantDeCombustible=" + cantDeCombustible + ", rendimientoPorLitro="
				+ rendimientoPorLitro + ", espacioDisponible()=" + espacioDisponible() + ", pocoCombustible()="
				+ pocoCombustible() + "]";
	}

	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public double getCapacidadTanque() {
		return capacidadTanque;
	}

	public void setCapacidadTanque(double capacidadTanque) {
		if(capacidadTanque > MAX_TANQUE) {
			this.capacidadTanque = MAX_TANQUE;
			System.out.println("Se lleno el tanque.");
		}else {
			this.capacidadTanque = capacidadTanque;
		}
	}

	public double getCantDeCombustible() {
		return cantDeCombustible;
	}

	public void setCantDeCombustible(double cantDeCombustible) {
		if(cantDeCombustible<0) {
			System.out.println("Ingrese valor positivo para la Cantidad de Combustible.");
		}else {
			this.cantDeCombustible = cantDeCombustible;
		}
	}

	public double getRendimientoPorLitro() {
		return rendimientoPorLitro;
	}

	public void setRendimientoPorLitro(double rendimientoPorLitro) {
		if(rendimientoPorLitro<0) {
			System.out.println("Ingrese valor positivo para el Rendimiento por Litro.");
		}else {
			this.rendimientoPorLitro = rendimientoPorLitro;
		}
	}
	
}
