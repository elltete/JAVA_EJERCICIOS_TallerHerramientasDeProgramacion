package tp2_1;

import java.time.LocalDateTime;

public class Fecha {

	private int dia;
	private int mes;
	private int anio;

	public Fecha() {
		this.dia = 0;
		this.mes = 0;
		this.anio = 0;
	}

	public Fecha(int d, int m, int a) 
	{
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}

	public String mostrarComoCadena() {
		return this.dia + " " + this.mes + " " + this.anio;
	}

	public void mostrarDiasTranscurridos() {
		LocalDateTime ahora= LocalDateTime.now();
		int anio = ahora.getYear();
		int mes = ahora.getMonthValue();
		int dia = ahora.getDayOfMonth();
		System.out.println("Transcurrido dia: " + (dia-this.dia) + " mes: " + (mes-this.mes) + " año: " + (anio-this.anio));
	}


}