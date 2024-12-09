package vetores;

import java.util.Scanner;

public class ExercicioVetoresDois {

	public static void main(String[] args) {
		int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número para buscar no vetor: "); 
        int num = leia.nextInt();

        int posicao = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == num) {
                posicao = i; 
                break;       
            }
        }

        if (posicao != -1) {
            System.out.println("O número " + num + " foi encontrado na posição: " + posicao);
        } else {
            System.out.println("Não foi encontrado!");
        }


	}

}
