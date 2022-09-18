package ParcialCargaDeCamiones;

public class Paquete {
	
	public String codigo;
	public double peso;
	
	public Paquete(String codigo, double peso) {
		this.codigo = codigo;
		this.peso = peso;
	}

	public String getCodigo() {
		return codigo;
	}

	public double getPeso() {
		return peso;
	}

}
