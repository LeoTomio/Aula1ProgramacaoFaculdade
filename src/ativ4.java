import java.util.Scanner;

public class ativ4 {

    public static void main(String[] args) {
    /*
    Escreva um programa que recebe um vetor de 10 posições de números inteiros e ordena
    os elementos dentro do vetor. Ao final, apresente o vetor ordenado
    */

        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = leitor.nextInt();
        }

        ordenarVetor(vetor);


        System.out.println("Vetor ordenado:");
        for (int i = 0; i < 10; i++) {

            System.out.println("[" + (i+1) + "]" +vetor[i]);
        }

    }

    public static void ordenarVetor(int[] vetor) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }
}
