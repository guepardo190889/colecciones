package com.blackdeath.colecciones;

/**
 * @author Seth Luis
 *
 */
public interface IGenericCollection<T> {
	public void agregar(T objeto);

	public T obtener();

	public void ordenar();
}
