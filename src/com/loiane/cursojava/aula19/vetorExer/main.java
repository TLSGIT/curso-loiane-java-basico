package com.loiane.cursojava.aula19.vetorExer;

public class main {

	public static void main(String[] args) {
		
		/** Exercícios de Java - Aula 19 */
		/** Questão 1 */
		
		int[] a = new int[5];
		int[] b = new int[5];
		
		for(int i=0; i<a.length; i++){
			a[i] = i+1;
			b[i] = a[i];
		}
		
		for(int i: a){
			System.out.println("O valor de a: " + i);
		}
		for(int i: b){
			System.out.println("O valor de b: " + i);
		}
		
		/** Questão 6 */
		int[] aq6 = new int[10];
		int[] bq6 = new int[10];
		int[] cq6 = new int[10];
		
		for(int i=0; i<aq6.length; i++){
			aq6[i] = i+1;
			bq6[i] = i+1;
			cq6[i] = aq6[i]+bq6[i];
		}
		
		for(int i : cq6){
			System.out.println("O valor do vector c is:" + i);
		}
		
		/** Questão 11 */
		int[] aq11 = new int[10];
		int pares = 0;
		for(int i=0; i<aq11.length; i++){
			aq11[i] = i+1;
			if((aq11[i]%2)==0) pares++;
		}
		System.out.println("Quantidade de pares: " + pares);
		
		/** Questão Nova */
		/** Aqui terei uma nova versão dos meus documentos. */
	}

}
