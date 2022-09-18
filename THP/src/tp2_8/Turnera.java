package tp2_8;

public class Turnera {

	private static int turno = 0;
	
	public int otorgarProximoNumero() {
		turno++;
		return turno;
	} 
	
	public int verUltimoNumeroOtorgado() {
		return turno;
	} 	
	
	public void resetearContador() {
		turno=0;
	} 
	
	public void resetearContador(int valor) {
		if(valor>=0) {
			turno=valor;
		}
	}
	
	public int getTurno() {
		return turno;
	}

	@Override
	public String toString() {
		return "Turnera [Turno=" + getTurno() + "]";
	}
	
}
