package tp2_12;

public class test {

	public static void main(String[] args) {
		
		ImpresoraMonocromatica impresora = new ImpresoraMonocromatica();
		impresora.recargarBandeja(5);


		Documento doc1 = new Documento(07,05,2021, "Titulo del Documento", "ioioioioioioioiioioioioioioioioioioioioioioioioioioioioioioioioio");

		impresora.imprimir(doc1);
		
		
	}

}
