package tp4_2021_14;

public class HoyoJugado {
	
	private int numero;
	private int cantGolpes;
	
	public HoyoJugado(int numero, int cantGolpes) {
		this.numero = numero;
		this.cantGolpes = cantGolpes;
	}

	public int getNumero() {
		return numero;
	}

	public int getCantGolpes() {
		return cantGolpes;
	}

	@Override
	public String toString() {
		return "HoyoJugado [numero=" + numero + ", cantGolpes=" + cantGolpes + "]";
	}

}
