package com.blackdeath.colecciones;

import java.util.Collection;
import java.util.Comparator;

/**
 * @author Seth Luis
 *
 */
public interface ISortedColecction<E> extends Collection<E> {
	public Comparator<E> getComparator();

	public void setComparator(Comparator<E> comp);
}
