package com.loiane.cursojava.aula52.MinhaException;

public class UsandoMinhaException {

	public static void main(String[] args) {
		int[] vet1 = {4,8,5,16,32,21,64,128};
		int[] vet2 = {2,0,4,8,0,2,4};
		
		for (int i=0; i<5; i++){
			try {
					if(vet1[i]%2 != 0 ){
						/** Lancamento de exception criada */
						throw new DivisaoNaoExata(vet1[i], vet2[i]);
					}
					System.out.println(vet1[i] + " dividido por: " + vet2[i] + " = " + (vet1[i]/vet2[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
				e.printStackTrace();
			}
		}
	}

}
	
	
