package Examen;

import java.util.ArrayList;

public class Socio {
	
	private String nombre;
	private int edad;
	private ArrayList<Socio> listaAmigos;
	
	public Socio(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		listaAmigos = new ArrayList<Socio>();
	}
	
	public boolean esAmigoCon(Socio socio) {
		boolean respuesta = false;
		int i = 0;
		while(i<listaAmigos.size() && !respuesta) {
			if(this.nombre.equals(listaAmigos.get(i).getNombre())) {
				respuesta = true;
			}else {
				i++;
			}
		}
		return respuesta;
	}
	
	public void establecerAmistad(Socio socio) {
		listaAmigos.add(socio);
	}
	
	public void deshacerAmistad(Socio socio){
		listaAmigos.remove(socio);
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	
	public ArrayList<Amigo> devolverAmigos(ArrayList<Amigo> amigos) {	
		for(Socio a: listaAmigos) {
			amigos.add(new Amigo(a.nombre, a.edad));
		}
		return amigos;
	}
	
	public double edadPromedioAmigos() {
		double promedio = 0;
		for(Socio s: listaAmigos) {
			promedio += s.edad;
		}
		return promedio/listaAmigos.size();
	}

	
	@Override
	public String toString() {
		return " [nombre=" + nombre + ", edad=" + edad + ", listaAmigos=" + listaAmigos + "]";
	}

}
