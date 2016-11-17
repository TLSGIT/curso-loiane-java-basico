package com.loiane.cursojava.aula50.ExceptionGenerica;

public class ExceptionGenerica {
	public static void main(String[] args) {
		
		int[] vet1 = { 1, 2, 3, 4, 5};
		int[] vet2 = { 1, 2, 0, 4};
		
		for (int i=0; i<5; i++){
			try {
					System.out.println(vet1[i] + " dividido por: " + vet2[i] + " = " + (vet1[i]/vet2[i]));
			} catch (Exception e) {
				System.out.println("Erro! -> " + e.getMessage());
				e.printStackTrace();
			} 
			/*catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro ao didivir por indice que não está presente!");
			} */
		}
	}
}
