package com.example.demo.model;

import java.util.ArrayList;

public class Registro {

	private static ArrayList<Usuario> elemento;
	
	static {
		elemento = new ArrayList<Usuario>();
		elemento.add(new Usuario(607, "Coutiquather", "Tammy J. Martin"));
		elemento.add(new Usuario(562, "Thesert", "Michelle S. Valencia"));
		elemento.add(new Usuario(772, "Qualking", "Nancy K. Taylor"));
		elemento.add(new Usuario(993, "Thereve93", "Brigitte J. Cox"));
	}

	public static ArrayList<Usuario> getElemento() {
		return elemento;
	}

	public static void setElemento(Usuario usuario) {
		elemento.add(usuario);
	}
	
}
