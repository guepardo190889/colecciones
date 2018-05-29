package com.blackdeath.colecciones;

public class Divisor<T extends Number> {
	private T numero;

	public Divisor(T numero) {
		this.numero = numero;
	}

	public T getNumero() {
		return numero;
	}

	public void setNumero(T numero) {
		this.numero = numero;
	}

	public void dividir() {
		System.out.println(numero.doubleValue() / 2);
	}

}
