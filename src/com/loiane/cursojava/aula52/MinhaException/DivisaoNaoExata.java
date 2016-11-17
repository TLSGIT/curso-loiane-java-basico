package com.loiane.cursojava.aula52.MinhaException;

public class DivisaoNaoExata extends Exception {
	protected int num;
	protected int denom;
	
	public DivisaoNaoExata(int num, int denom) {
		super();
		this.num = num;
		this.denom = denom;
	}

	@Override
	public String toString() {
		return "Resultado de " + num + "/" + denom + " não é um inteiro!";
	}
	
	
	

}
