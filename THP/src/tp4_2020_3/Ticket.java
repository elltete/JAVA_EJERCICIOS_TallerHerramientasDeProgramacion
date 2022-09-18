package tp4_2020_3;

public class Ticket {
	
	private String prodcuto;
	private int cantidad;
	
	public Ticket(String prodcuto, int cantidad) {
		this.prodcuto = prodcuto;
		this.cantidad = cantidad;
	}

	public String getProdcuto() {
		return prodcuto;
	}

	public int getCantidad() {
		return cantidad;
	}

}
