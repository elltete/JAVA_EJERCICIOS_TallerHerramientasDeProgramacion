package tp2_11;

public class Superheroe {

	final static int MINIMO = 0;
	final static int MAXIMO = 100;
	final static String TRIUNFO = "TRIUNFO";
	final static String EMPATE = "EMPATE";
	final static String DERROTA = "DERROTA";
	
	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;
	
	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		this.setNombre(nombre);
		this.setFuerza(fuerza);
		this.setResistencia(resistencia);
		this.setSuperpoderes(superpoderes);
	}
	
	public TipoResultado competir(Superheroe s) {
		int i=0;
		TipoResultado devolver = TipoResultado.DERROTA;
		i = resultado(this.fuerza, s.fuerza) + resultado(this.resistencia, s.resistencia) + resultado(this.superpoderes, s.superpoderes);
		if (i==1) {
			devolver = TipoResultado.EMPATE;
		}
		if (i>2) {
			devolver = TipoResultado.TRIUNFO;
		}
		return devolver;
	}
	
	private int resultado(int a, int b) {
		int resultado=0;
		if (a<b) {
			resultado--;
		}else {
			if (a>b) {
			resultado+=2;
			}
		}
		return resultado;
	}

	public String getNombre() {
		return nombre;
	}

	public int getFuerza() {
		return fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public int getSuperpoderes() {
		return superpoderes;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setFuerza(int fuerza) {
		this.fuerza = setValue(fuerza);
	}

	private void setResistencia(int resistencia) {
		this.resistencia = setValue(resistencia);
	}

	private void setSuperpoderes(int superpoderes) {
		this.superpoderes = setValue(superpoderes);
	}

	private int setValue(int value) {
		int ret = value;
		if (value < MINIMO) {
			ret = MINIMO;
		} else if (value > MAXIMO) {
			ret = MAXIMO;
		}
		return ret;
	}
	
	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia + ", superpoderes=" + superpoderes + "]";
	}
}