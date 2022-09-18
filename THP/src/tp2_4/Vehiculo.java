package tp2_4;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String color;
	private int velocidadMaxima;
	private int kilometraje = 0;
	private int velocidadActual = 0;
	private boolean encendido = false;
	private int grados=0;

	public Vehiculo() {
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.velocidadMaxima = 0;
		
	}

	public Vehiculo(String marca, String modelo, String color, int velocidadMaxima) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidadMaxima = velocidadMaxima;
	}

	public void setEncendido(boolean valor) {
		this.encendido = valor;
	}

	public boolean getEncendido() {
		return this.encendido;
	}

	public void setGrados(int valor) {
		this.grados=valor;
	}
	
	public void setVelocidadActual(int valor) {
		this.velocidadActual = valor;
	}

	public int getVelocidadActual() {
		return this.velocidadActual;
	}

	public void acelerar(int km) {
		if(getEncendido()) {
			if((this.getVelocidadActual()+km)<this.velocidadMaxima) {
				velocidadActual += km;
			}else {
				this.setVelocidadActual(this.velocidadMaxima);
				System.out.println("Se llego a la maxima velocidad.");				
			}
		}else {
			System.out.println("El auto esta apagado.");	
		}
	}

	public void girar(DIRECCION valor, int grados) {
		int gradosAux=0;
		if(this.grados<1) {
			System.out.println("El grado a girar debe ser positivo.");			
		}else {
			if(this.grados>90) {
				gradosAux=90;
			}else {
				gradosAux=grados;
			}
			switch(valor) {
				case IZQUIERDA:
					this.setGrados(gradosAux*(-1));
					break;
				case DERECHA:
					this.setGrados(gradosAux);
					break;	
			}
		}
	}

	public void encender() {
		if (this.encendido) {
			System.out.println("El auto ya esta encendido.");
		}else {
			this.setEncendido(true);
			this.setVelocidadActual(0);
			System.out.println("Se encendio el auto.");			
		}
	}

	public void apagar() {
		if (this.encendido) {
			if (this.getVelocidadActual()!=0) {
				this.setEncendido(false);
				this.setVelocidadActual(0);
				System.out.println("El auto se apago.");					
			}else {
				System.out.println("Vehiculo en marcha, no se puede apagar.");	
			}
		}else {
			System.out.println("El auto ya esta APAGADO.");		
		}

		this.encendido = false;
	}

	public void frenar(int km) {
		if(getEncendido()) {
			if((this.getVelocidadActual()-km)<0) {
				this.setVelocidadActual(0);
			}else {
				this.setVelocidadActual(this.getVelocidadActual()-km);
				System.out.println("El auto se freno.");				
			}
		}else {
			System.out.println("El auto esta apagado.");	
		}
	}

	@Override
	public String toString(){
		return "Vehiculo [marca=" + this.marca + ", modelo=" + this.modelo + ", color=" + this.color + ", Velocidad Maxima=" + this.velocidadMaxima + ", kilometraje=" + this.kilometraje + "]";
	}
}
