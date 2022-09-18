package tp2_2;

public class DVD {
	
	private String marca;
	private boolean grabacion;
	
	public DVD() {
		this.marca = "";
		this.grabacion = false;
	}
	
	public DVD(String marca, boolean valor) {
		this.marca = marca;
		this.grabacion = valor;
	}	
	
	public boolean getGrabacion() {
		return this.grabacion;
	}
	
	@Override
	public String toString(){
		return "DVD [marca=" + this.marca + ", graba?=" + this.grabacion + "]";
	}
		
}