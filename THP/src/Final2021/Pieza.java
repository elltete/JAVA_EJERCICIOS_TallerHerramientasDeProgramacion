package Final2021;

public class Pieza {
	
	private String nombre;
	private TipoOperativo operativa;
	
	public Pieza(String nombre) {
		this.nombre = nombre;
		this.operativa = TipoOperativo.OPERATIVO;
	}
	
	public void piezaRota() {
		this.operativa = TipoOperativo.FUERA_DE_SERVICIO;		
	}

	public boolean estaOperativa() {
		boolean retorno = false;
		if (operativa == TipoOperativo.OPERATIVO) {
			retorno = true;
		}
		return retorno;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public String toString() {
		return "Pieza [nombre=" + nombre + ", operativa=" + operativa + "]";
	}
	
}
