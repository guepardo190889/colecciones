package com.blackdeath.colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de práctica de Generics en Java
 * http://mundogeek.net/archivos/2009/03/11/generics-en-java/
 * 
 * @author Seth Luis
 *
 */
public class GenericsPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Imprimidor<String> impStr = new Imprimidor<String>("Hola mundo");
		impStr.imprimir();
		impStr.imprimirRevesStringBuffer();

		Imprimidor<Integer> impInt = new Imprimidor<Integer>(143);
		impInt.imprimir();
		impInt.imprimirRevesStringBuffer();

		Imprimidor.imprimir_reves(23);
		Imprimidor.<Integer>imprimir_reves(123);

		Integer i = 1;
		Double d = 2.7;

		i = d.intValue();

		System.out.println(i);

	}

}
