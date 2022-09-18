package tp2_6;

import java.util.Date;

public class CuentaBancaria {
	
	private String cbu;
	private TipoCuenta tipo;
	private double saldo=0;
	private Fecha fechaApertura;
	private Persona titular;
	
	public CuentaBancaria(TipoCuenta tipo, Persona titular) {
		this.tipo = tipo;
		this.cbu = this.generarCBU();
		this.fechaApertura = this.obtenerFechaHoy();
		this.titular = titular;
	}

	public Fecha obtenerFechaHoy() {
		Fecha fecha = new Fecha();
		return fecha;
	}
	
	public String generarCBU() {
		return "1538888100000012345678";
	}
	
	public double verSaldo() {
		return this.getSaldo();
	}
	
	public void depositar(double valor) {
		if(valor<=0) {
			System.out.println("Ingrese un valor positivo a depositar.");
		}else if(valor>100000) {
			System.out.println("Para esa cantidad de monto, debe ir por cajas.");
		}else {
		this.setSaldo(valor);
		}
	}
	
	public boolean extraer(double valor) {
		boolean respuesta = false;
		if(valor<=0) {
			System.out.println("Ingrese un valor positivo a extraer.");
		}else {
			if(getSaldo()>=valor) {
				this.setSaldo(valor*(-1));
				respuesta = true;
			}
		}
		return respuesta;
	}
	
	public String getCbu() {
		return this.cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public TipoCuenta getTipo() {
		return this.tipo;
	}

	public void setTipo(TipoCuenta tipo) {
		this.tipo = tipo;
	}

	private double getSaldo() {
		return this.saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	public Fecha getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Fecha fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public Persona getTitular() {
		return this.titular;
	}

	private void setTitular(Persona titular) {
		this.titular = titular;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [cbu=" + cbu + ", tipo=" + tipo + ", saldo=" + saldo + ", fechaApertura=" + fechaApertura
				+ ", titular=" + titular + "]";
	}

	public String toString2() {
		return "La cuenta bancaria de tipo " + this.getTipo() + " le pertenece a " + this.getTitular().getNombreApellido()
				+ ", cuyo DNI es " + this.getTitular().getDni() + " con domicilio en " + this.getTitular().getDireccion();
	}

}
