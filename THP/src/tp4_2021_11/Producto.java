package tp4_2021_11;

public class Producto {
	
	private String nombre;
	private String fechaAlmacenamiento;
	private int diasMaximo;
	
	public Producto(String nombre, String fechaAlmacenamiento, int diasMaximo) {
		this.nombre = nombre;
		this.fechaAlmacenamiento = fechaAlmacenamiento;
		this.diasMaximo = diasMaximo;
	}

	public String getNombre() {
		return nombre;
	}
	
	public TipoEstado estadoProducto() {
		TipoEstado tipo = TipoEstado.FRESCO;
		if(diasMaximo<7) {
			tipo = TipoEstado.FRESCO;
		} else {
			tipo = TipoEstado.PARA_DESCARTE;
		}
		return tipo;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", fechaAlmacenamiento=" + fechaAlmacenamiento + ", diasMaximo=" + diasMaximo + "]";
	}
	
}
