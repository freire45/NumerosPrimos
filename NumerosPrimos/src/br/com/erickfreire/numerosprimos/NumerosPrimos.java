package br.com.erickfreire.numerosprimos;


/**
 * Programa em Java que verifica se um número é primo
 * @author Erick Freire
 * @version 1 Criado em 03-05-2021 as 17:33
 */

public class NumerosPrimos {

	public static void main(String[] args) {
		
		System.out.println("Programa que verifica quantos números de 1 a 10000 são primos:");
		
		for(int i = 1; i <= 10000; i++) {
			verificaPrimo(i);
		}

	}
	
	public static void verificaPrimo(int n) {
		int primo = 0;
		
		if(n == 1) {
			System.out.printf("%nO numero %d é primo", n);
		} else {
			if(n > 1) {
		
		   for(int i = 1; i <= n; i++) {
			
			   if(n % i == 0) {
				   primo++;
			   }
		   }
		   
		   if(primo == 2) {
		   	   System.out.printf("%nO número %d é primo", n);
		   }
		
		   }
		}
		
	}

}
