package com.blackdeath.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;
import java.util.stream.Collectors;

/**
 * Prácticas y ejercicios con colecciones
 * 
 * http://mundogeek.net/archivos/2009/03/16/colecciones-en-java/
 * 
 * @author Seth Luis
 *
 */
public class CollectionsPractice {

	private static void coleccionSet() {
		// Set
		// No puede contener elementos duplicados
		// Como máximo un elemento nulo
		//
		// No sincronizadas:
		// *HashSet
		// -tabla hash
		// -mejor rendimiento
		// -no garantiza ningún orden al iterar
		Set hashSetSinSincronizacion = new HashSet();
		Set hashSetSincronizado = Collections.synchronizedSet(new HashSet());

		// *TreeSet
		// -ordena en función de los valores
		// -más lento que HashSet
		// -elementos almacenados deben implementar Comparable
		Set treeSetSinSincronizacion = new TreeSet();
		Set treeSetSincronizado = Collections.synchronizedSet(new TreeSet());

		// *LinkedHashSet
		// -almacenamiento en función del orden de inserción
		// -más costosa que HashSet
		Set linkedHashSetSinSincronizacion = new LinkedHashSet();
		Set linkedHashSetSincronizado = Collections.synchronizedSet(new LinkedHashSet());

		pruebaRendimientoSet();
	}

	private static void pruebaRendimientoSet() {
		final Set<Integer> hashSet = new HashSet<>(1_000_000);
		final Long startHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			hashSet.add(i);
		}
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));

		final Set<Integer> treeSet = new TreeSet<Integer>();
		final Long startTreeSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			treeSet.add(i);
		}
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));

		final Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(1_000_000);
		final Long startLinkedHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			linkedHashSet.add(i);
		}
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
	}

	private static void collectionList() {
		// List
		// admite elementos duplicados
		// permite acceso posicional a los elementos
		//
		// Bo sincronizadas:
		// *ArrayList
		// -basado en un array dimensional que aumenta de tamaño
		// -mejor rendimiento
		//
		// *LinkedList
		// -Basada en una lista doblement enlazada
	}

	private static void collectionMap() {
		// No puede contener claves duplicadas
		// Cada clave sólo puede tener un valor asociado
		//
		// *HashMap
		// -claves en tabla hash
		// -no garantiza orden al iterar
		// -mejor rendimiento
		//
		// *TreeMap
		// -claves ordenadas
		//
		// *LinkedHashMap
		// -claves según el orden de inserción
	}

	private static void stream() {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("p1"));
		people.add(new Person("p2"));
		people.add(new Person("p3"));

		List<String> namesList = people.stream().map(Person::getFirstName).collect(Collectors.toList());
		Set<String> namesSet = people.stream().map(Person::getFirstName).collect(Collectors.toSet());

		for (String name : namesList) {
			System.out.println(name);
		}
	}

	private static void imprimir(List list) {
		for (Object o : list) {
			System.out.println(o);
		}
		System.out.println();
	}

	private static void polimorfismoConstructoresCollections() {
		ArrayList<String> al = new ArrayList<>();
		al.add("test1");
		al.add("test2");

		imprimir(al);

		Vector<String> v = new Vector<>(al);
		imprimir(v);

		HashMap<String, String> hm = new HashMap<>();
		hm.put("key1", "value1");
		hm.put("key2", "value2");

		List<String> ll = new LinkedList<>(hm.values());

		imprimir(ll);
	}

	private static void collectionsClassMethods() {
		ArrayList<String> al = new ArrayList<>();
		al.add("test1");
		al.add("test2");
		al.add("test3");

		System.out.println("original");
		imprimir(al);

		ArrayList<String> alreverse = new ArrayList<>(al);
		Collections.reverse(alreverse);
		System.out.println("reverse");
		imprimir(alreverse);

		System.out.println("max: " + Collections.max(al));

		ArrayList<Person> persons = new ArrayList<>();
		persons.add(new Person("p1"));
		persons.add(new Person("p2"));
		persons.add(new Person("p3"));
		persons.add(new Person("p4"));
		persons.add(new Person("p5"));

		System.out.println("persons");
		imprimir(persons);

		shuffle(persons);
		sort(persons);
	}

	private static void shuffle(List<Person> persons) {
		Collections.shuffle(persons);

		System.out.println("persons shuffle");
		imprimir(persons);
	}

	private static void sort(List<Person> persons) {
		Collections.sort(persons, new PersonComparatorAsc());

		System.out.println("persons sorted asc");
		imprimir(persons);

		Collections.sort(persons, new PersonComparatorDesc());

		System.out.println("persons sorted des");
		imprimir(persons);
	}

	public static void main(String[] args) {
		coleccionSet();
		stream();
		polimorfismoConstructoresCollections();
		collectionsClassMethods();
	}

}
