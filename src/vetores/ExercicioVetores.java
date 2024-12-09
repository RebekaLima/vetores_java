package vetores;

import java.util.Scanner;

public class ExercicioVetores {
	
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int[] numeros = new int[10];

	        System.out.println("Digite 10 números inteiros:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            numeros[i] = scanner.nextInt();
	        }

	        System.out.println("\nElementos nos índices ímpares:");
	        for (int i = 1; i < numeros.length; i += 2) {
	            System.out.println(numeros[i]);
	        }

	        System.out.println("\nElementos pares no vetor:");
	        for (int numero : numeros) {
	            if (numero % 2 == 0) {
	                System.out.println(numero);
	            }
	        }

	        int soma = 0;
	        for (int numero : numeros) {
	            soma += numero;
	        }
	        System.out.println("\nSoma de todos os elementos: " + soma);

	        double media = soma / (double) numeros.length;
	        System.out.println("Média de todos os elementos: " + media);

	}

}