package com.loiane.cursojava.aula49.ExcepFinally;

public class TestandoFinnaly {
	public static void main(String[] args) {
		
		int[] vet1 = { 1, 2, 3, 4, 5};
		int[] vet2 = { 1, 2, 0, 4};
		
		for (int i=0; i<5; i++){
			try {
					System.out.println(vet1[i] + " dividido por: " + vet2[i] + " = " + (vet1[i]/vet2[i]));
			} 
			catch (ArithmeticException e) {
				System.out.println("Erro ao didivir por zero!");
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Erro ao didivir por indice que não está presente!");
				/** Este código encerra o catch sem ir ao finally */ //System.exit(0);
			}
			finally{
				System.out.println("Bloco final de execução, este bloco é executado após os blocos catch e try, se não tiver um System.exit(0).");
				
			}
		}
	}
}
