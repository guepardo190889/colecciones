package com.blackdeath.colecciones;

import java.util.Comparator;

/**
 * @author Seth Luis
 *
 */
public class PersonComparatorAsc implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
