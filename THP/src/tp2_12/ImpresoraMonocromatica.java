package tp2_12;

public class ImpresoraMonocromatica {
	
	static final int MAX_BANDEJA = 35;
	static final int CARACTERES_POR_TINTA = 50;
	static final int CARACTERES_POR_HOJA = 20;
	
	private boolean encendida = false;
	private int hojasEnBandeja= 0;
	private int nivelTintaNegra = 1;
	
	public void imprimir(Documento doc) {
		int a = nivelSegunCantCaracteres(doc.getCuerpo().length());
		int b = hojasSegunCantCaracteres(doc.getCuerpo().length());
		
		if(this.nivelTintaNegra<a) {
			System.out.println("No hay suficiente tinta para imprimir el documento");
		} else 
			if (this.hojasEnBandeja<b) {
				System.out.println("No hay suficientes hojas para imprimir el documento");
			} else {
				System.out.println("**" + doc.getTitulo() + "**");
				System.out.println(doc.getFecha().toString());
				System.out.println(doc.getCuerpo());
				this.nivelTintaNegra -= a;
				this.nivelTintaNegra -= b;
			}
	}
	
	public int nivelSegunCantCaracteres(int a) {
		return (a/CARACTERES_POR_TINTA);
	}
	
	public int hojasSegunCantCaracteres(int a) {
		return (a/CARACTERES_POR_HOJA);
	}
	
	public void recargarBandeja(int a) {
		if(a>0) {
			if(this.hojasEnBandeja+a < MAX_BANDEJA) {
				this.hojasEnBandeja += a;
			}else {
				this.hojasEnBandeja = MAX_BANDEJA;				
			}
		}
	}

}
