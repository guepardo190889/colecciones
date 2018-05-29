package com.blackdeath.colecciones;

public class Imprimidor<A> {
	private A objeto;

	public Imprimidor(A objeto) {
		this.objeto = objeto;
	}

	public A getObjeto() {
		return objeto;
	}

	public void setObjeto(A objeto) {
		this.objeto = objeto;
	}

	public void imprimir() {
		System.out.println(objeto.toString());
	}

	public void imprimirRevesStringBuffer() {
		StringBuffer sb = new StringBuffer(objeto.toString());
		System.out.println(sb.reverse());
	}

	public void imprimirRevesStringBuilder() {
		StringBuilder sbui = new StringBuilder(objeto.toString());
		System.out.println(sbui.reverse());
	}

	public static <T> void imprimir_reves(T objeto) {
		StringBuffer sb = new StringBuffer(objeto.toString());
		System.out.println(sb.reverse());
	}

}
