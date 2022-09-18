package ParcialCargaDeCamiones;

import java.util.ArrayList;

public class Deposito {

	private String provincia;
	private Taller taller;
	private ArrayList<Camion> arrayCamiones;
	private ArrayList<Paquete> arrayPaquetes;

	public Deposito(String provincia, String domicilioTaller, String telefonoTaller) {
		this.provincia = provincia;
		this.taller = new Taller(domicilioTaller, telefonoTaller);
		arrayCamiones = new ArrayList<Camion>();
		arrayPaquetes = new ArrayList<Paquete>();
	}	

	public boolean cargarPaquete(Paquete paquete) {
		boolean respuesta = false;
		int i = 0;
		while(i<arrayCamiones.size() && !respuesta) {
			if(arrayCamiones.get(i).hayLugar(paquete)) {
				arrayCamiones.get(i).cargarPaquete(paquete);
				respuesta = true;
			}else {
				i++;
			}
		}
		return respuesta;
	}

	public void distribuirCarga(Camion camion) {
		ArrayList<Paquete> paquetesADistribuir = camion.getArrayPaquetes();
		camion.ordenarCargar();
		for(int i=0; i<paquetesADistribuir.size(); i++) {
			if(cargarPaquete(paquetesADistribuir.get(i))) {
				paquetesADistribuir.remove(paquetesADistribuir.get(i));
			}
		}
		if(paquetesADistribuir.size()>0) {
			for(int i=0; i<paquetesADistribuir.size(); i++) {
				moverADeposito(paquetesADistribuir.remove(0));
			}
		}
	}

	public void moverADeposito(Paquete paquete) {
		arrayPaquetes.add(paquete);
	}

	public String getProvincia() {
		return provincia;
	}


}
