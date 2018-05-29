package com.blackdeath.colecciones;

public class Sumador<T1 extends Number, T2 extends Number> {
	private T1 numero1;
	private T2 numero2;

	public Sumador(T1 numero1, T2 numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public T1 getNumero1() {
		return numero1;
	}

	public void setNumero1(T1 numero1) {
		this.numero1 = numero1;
	}

	public T2 getNumero2() {
		return numero2;
	}

	public void setNumero2(T2 numero2) {
		this.numero2 = numero2;
	}

	public void sumar() {
		System.out.println(numero1.doubleValue() + numero2.doubleValue());
	}
}
