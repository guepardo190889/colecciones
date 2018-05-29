package com.blackdeath.colecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Seth Luis
 *
 */
public class IBMJavaAPICollection {

	private static void convertArrayToList() {
		String[] arr = new String[] { "a", "b", "c" };

		// Esto es inmutable
		List<String> argList = Arrays.asList(arr);
		try {
			argList.add("d");
		} catch (UnsupportedOperationException e) {
		}

		// Esto es mutable
		argList = new ArrayList<>(Arrays.asList(arr));
		argList.add("d");

		System.out.println(argList);
	}

	private static void moverValoresEntreListas() {
		ArrayList<Integer> listaOrigen = new ArrayList<>();

		for (int i = 0; i < 1_00_000; i++) {
			listaOrigen.add(i);
		}

		ArrayList<Integer> listaDestino = new ArrayList<>();

		final Long tiempoInicioIteracion = System.currentTimeMillis();

		for (Integer i : listaOrigen) {
			listaDestino.add(i);
		}

		final Long tiempoFinIteracion = System.currentTimeMillis();

		System.out.println("Tiempo por iteración : " + (tiempoFinIteracion - tiempoInicioIteracion));

		listaDestino.clear();

		final Long tiempoInicioAddAll = System.currentTimeMillis();
		listaDestino.addAll(listaOrigen);
		final Long tiempoFinAddAll = System.currentTimeMillis();

		System.out.println("Tiempo por addAll : " + (tiempoFinAddAll - tiempoInicioAddAll));
	}

	private static void domainClassIterable() {
		Person ted = new Person("Ted", "Neward", 39, new Person("Michael", "Neward", 16),
				new Person("Matthew", "Neward", 10));

		// Iterate over the kids
		for (Person kid : ted) {
			System.out.println(kid.getFirstName());
		}

		// Reverse iterator
		// Make a copy of the List
		List<Person> kids = new ArrayList<Person>(ted.getChildren());
		// Reverse it
		Collections.reverse(kids);
		// Display it
		System.out.println(kids);
	}

	public static void main(String[] args) {
		convertArrayToList();
		moverValoresEntreListas();
		domainClassIterable();
	}

}
