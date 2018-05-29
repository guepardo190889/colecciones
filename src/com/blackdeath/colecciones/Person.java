package com.blackdeath.colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Seth Luis
 *
 */
public class Person implements Iterable<Person> {
	private String firstName;
	private String lastName;
	private int age;
	private List<Person> children = new ArrayList<Person>();

	public Person(String firstName) {
		this.firstName = firstName;
	}

	public Person(String fn, String ln, int a, Person... kids) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = a;
		for (Person child : kids)
			children.add(child);
	}

	public String getFirstName() {
		return firstName;
	}

	public void seFirstNametName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Person> getChildren() {
		return children;
	}

	@Override
	public Iterator<Person> iterator() {
		return children.iterator();
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", children=" + children
				+ "]";
	}

}
