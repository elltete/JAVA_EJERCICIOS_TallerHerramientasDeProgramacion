package tp4_2020_4;

public class Auto {
	
	private String matricula;
	private String marca;
	private String modelo;
	private int km;
	
	public Auto(String matricula, String marca, String modelo, int km) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.km = km;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getKm() {
		return km;
	}

	@Override
	public String toString() {
		return "Auto [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", km=" + km + "]";
	}
	
}
