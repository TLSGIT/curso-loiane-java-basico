package com.loiane.cursojava.aula48.Exceptions;

public class MultiplosCatch {

	public static void main(String[] args) {
		
		int[] vet1 = { 1, 2, 3, 4, 5};
		int[] vet2 = { 1, 2, 0, 4};
		
		for (int i=0; i<5; i++){
			try {
					System.out.println(vet1[i] + " dividido por: " + vet2[i] + " = " + (vet1[i]/vet2[i]));
			} catch (ArithmeticException e) {
				System.out.println("Erro ao didivir por zero!");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro ao didivir por indice que não está presente!");
			} 
			/** Em caso necessite capturar em uma única sentença 
			catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro em uma única sentença");
			} 
			/** Em caso de capturar uma exception genérica
			catch (Throwable e) {
				System.out.println("Erro genérico.");
			}
			*/
		}
		

	}

}
