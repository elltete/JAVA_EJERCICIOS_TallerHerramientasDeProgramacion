package ParcialCargaDeCamiones;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Deposito> arrayDepositos;

	public Empresa(String nombre) {
		this.nombre = nombre;
		arrayDepositos = new ArrayList<Deposito>();;
	}

	public void cargarDeposito(String provincia, String domicilioTaller, String telefonoTaller) {
		if(buscarDeposito(provincia)!=null) {
			System.out.println("El deposito ya existe");
		}else {
			arrayDepositos.add(new Deposito(provincia,domicilioTaller,telefonoTaller));
		}
	}
	
	private Deposito buscarDeposito(String provincia) {
		Deposito deposito = null;
		int i = 0;
		while(i<arrayDepositos.size() && deposito == null) {
			if(arrayDepositos.get(i).getProvincia().equals(provincia)) {
				deposito = arrayDepositos.get(i);
			}else {
				i++;
			}
		}
		return deposito;
	}
	
}
