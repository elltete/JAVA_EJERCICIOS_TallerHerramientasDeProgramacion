package Final2021;

import java.util.ArrayList;

public class Droide {
	
	private String codigo;
	private TipoOperativo operativo;
	private ArrayList<Pieza> listaPiezas;
	private ArrayList<Pieza> listaPiezasReemplazadas;
	private ArrayList<Droide> listaDroidesNoOperativos;
	
	public Droide(String codigo) {
		this.codigo = codigo;
		this.operativo = TipoOperativo.OPERATIVO;
		this.listaPiezas = new ArrayList<Pieza>();
		this.listaDroidesNoOperativos = new ArrayList<Droide>();
		listaPiezas.add(null);
	}

	public ArrayList<Pieza> autoRepararse(){
		listaPiezasReemplazadas = new ArrayList<Pieza>();
		Pieza piezaReemplazada;
		if(listaDroidesNoOperativos.size()!=0) {
			for(int i=0; i<listaPiezas.size(); i++ ) {
				if(!(listaPiezas.get(i).estaOperativa())) {
					piezaReemplazada = buscarReemplazo(i, listaPiezas.get(i));
					if(piezaReemplazada != null) {
						listaPiezasReemplazadas.add(piezaReemplazada);
					}
				}
			}
		}
		return listaPiezasReemplazadas;
	}
	
	public boolean estaOperativo() {
		boolean retorno = false;
		if(operativo == TipoOperativo.OPERATIVO) {
			retorno = true;
		}
		return retorno;
	}
	
	private Pieza buscarReemplazo(int pos, Pieza piezaAReemplazar) {
		int i = 0;
		Pieza piezaReemplazada = null;
		Pieza piezaEncontrada = null;
		while(i<listaDroidesNoOperativos.size() && piezaEncontrada==null) {
			piezaEncontrada = listaDroidesNoOperativos.get(i).buscarYRemoverPieza(piezaAReemplazar.getNombre());
			if(piezaEncontrada!=null) {
				piezaReemplazada = reemplazarPieza(pos ,piezaEncontrada);
			}
		}
		return piezaReemplazada;
	} 
	
	private Pieza buscarYRemoverPieza(String nombrePieza) {
		Pieza pieza = null;
		int i = 0;
		while (i<listaPiezas.size() && pieza==null) {
			if(listaPiezas.get(i).getNombre().equals(nombrePieza) && !(listaPiezas.get(i).estaOperativa())) {
				pieza = listaPiezas.remove(i);
			}else {
				i++;
			}
		}
		return pieza;
	}
	
	public void agregarPieza(Pieza pieza) {
		listaPiezas.add(pieza);
	}
	
	public boolean agregarDroide(Droide droide) {
		boolean retorno = false;
		if(!(droide.estaOperativo())) {
			listaDroidesNoOperativos.add(droide);
			retorno = true;
		}
		return retorno;
	}
	
	private Pieza reemplazarPieza(int pos, Pieza pieza) {
		return pieza;
	}
	
}
