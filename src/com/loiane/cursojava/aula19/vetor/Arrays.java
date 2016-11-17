package com.loiane.cursojava.aula19.vetor;

public class Arrays {

	public static void main(String[] args) {
		
		double tempDia001 = 31.3;
		double tempDia002 = 34;
		double tempDia003 = 36.3;
		double tempDia004 = 30.9;
		
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 34;
		temperaturas[2] = 36.9;
		temperaturas[3] = 30.9;
		
		System.out.println("O valor das temperaturas é: " + temperaturas[0]);
		
		System.out.println("O tamanho do meu array é: " + temperaturas.length);
		
		for(int i=0; i<temperaturas.length; i++){
			System.out.println("Temperatura do dia " + (i+1) + " foi igual a: " + temperaturas[i]);			
		}
		
		for(double temp : temperaturas){
			System.out.println(temp);
		}

	}

}
