package Examen;

import java.util.ArrayList;

public class Club {

	private final static int EDAD_MENOR_ACEPTADA = 0;
	private final static int EDAD_MAYOR_ACEPTADA = 90;

	private String nombre;
	private ArrayList<Socio> listaSocios;

	public Club(String nombre) {
		this.nombre = nombre;
		listaSocios = new ArrayList<Socio>();
	}


	public Resultado agregarSocio(String nombre, int edad) {
		Resultado resultado = Resultado.OK;
		if(nombre.isEmpty()) {
			resultado = Resultado.NOMBRE_VACIO;
		}else {
			if(!verificarEdad(edad)) {
				resultado = Resultado.EDAD_ERRONEA;				
			}else {
				if(socioExiste(nombre)) {
					resultado = Resultado.YA_EXISTE;				
				}else {
					listaSocios.add(new Socio(nombre, edad));
				}
			}
		}
		System.out.println(resultado + " ");
		return resultado;
	}

	private boolean verificarEdad(int edad) {
		boolean resultado = false;
		if(edad>EDAD_MENOR_ACEPTADA && edad<EDAD_MAYOR_ACEPTADA) {
			resultado = true;			
		}
		return resultado;
	}

	private boolean socioExiste(String nombre) {
		boolean resultado = false;
		if(buscarSocio(nombre) != null) {
			resultado = true;			 
		}
		return resultado;		
	}

	private Socio buscarSocio(String nombre) {
		Socio socioEncontrado = null;
		int i = 0;
		while(i<listaSocios.size() && socioEncontrado == null) {
			if(listaSocios.get(i).getNombre().equalsIgnoreCase(nombre)) {
				socioEncontrado = listaSocios.get(i);	
			}else {
				i++;
			}
		}
		return socioEncontrado;
	}

	public Resultado establecerAmistad(String nombreSocio1, String nombreSocio2) {
		Resultado resultado = Resultado.OK;
		Socio socio1 = buscarSocio(nombreSocio1);
		Socio socio2 = buscarSocio(nombreSocio2);		
		if(socio1 == null || socio2 == null) {
			resultado = Resultado.NO_EXISTE;
		}else {
			if(nombreSocio1.equals(nombreSocio2)) {
				resultado = Resultado.NOMBRES_IGUALES;				
			}else {
				if(sonAmigos(socio1, socio2)) {
					resultado = Resultado.YA_SON_AMIGOS;				
				}else {
					socio1.establecerAmistad(socio2);
					socio2.establecerAmistad(socio1);
				}
			}
		}
		System.out.println(resultado + " ");
		return resultado;		
	}
	
	private boolean sonAmigos(Socio socio1, Socio socio2) { 
		boolean amigos = false;
			if(socio1.esAmigoCon(socio2)) {
				amigos = true;				
			}
		return amigos;
	}

	public Resultado deshacerAmistad(String nombreSocio1, String nombreSocio2) {
		Resultado resultado = Resultado.OK;
		Socio socio1 = buscarSocio(nombreSocio1);
		Socio socio2 = buscarSocio(nombreSocio2);		
		if(socio1 == null || socio2 == null) {
			resultado = Resultado.NO_EXISTE;
		}else {
			if(nombreSocio1.equals(nombreSocio2)) {
				resultado = Resultado.NOMBRES_IGUALES;				
			}else {
				if(!sonAmigos(socio1, socio2)) {
					resultado = Resultado.NO_SON_AMIGOS;				
				}else {
					socio1.deshacerAmistad(socio2);
					socio2.deshacerAmistad(socio1);
				}
			}
		}
		System.out.println(resultado + " ");
		return resultado;		
	}

	public void listarAmigos(String nombreSocio){
		ArrayList<Amigo> amigos = new ArrayList<Amigo>();
		System.out.println ("Amigos de " + nombreSocio);
		Socio socio = buscarSocio(nombreSocio);
		if(socio == null) {
			System.out.println("No hay nadie que se llame " + nombreSocio);			
		}else {
			amigos = socio.devolverAmigos(amigos);
			
			if(amigos.isEmpty()) {
				System.out.println(nombreSocio + " no tiene amigos.");
			}else {
				for(Amigo a: amigos) {
					System.out.println(a);
				}
			}	
		}	
	}

	public void listadoDeSociosyAmigos() {
		for(Socio s: listaSocios) {
			System.out.println("Socio: " + s.getNombre() + " , edad promedio: "+ s.edadPromedioAmigos());

		}
	}

}
