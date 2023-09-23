import java.util.Scanner;

public class ativ5 {

    public static void main(String[] args) {
    /*
    Escreva um programa que recebe duas matrizes 4x4, realiza o produto entre elas e mostra a matriz resultado.
    */

        Scanner leitor = new Scanner(System.in);
        int linhas = 2;
        int colunas = 2;
        int[][] matrizA = new int[linhas][colunas];
        int[][] matrizB = new int[linhas][colunas];


        System.out.println("Digite os elementos da matriz A:");
        preencherMatriz(leitor, matrizA);

        // Preencha a matriz B
        System.out.println("Digite os elementos da matriz B:");
        preencherMatriz(leitor, matrizB);


        int[][] matrizResultado = multiplicarMatrizes(matrizA, matrizB);

        System.out.println("Matriz Resultado:");
        imprimirMatriz(matrizResultado);

        leitor.close();

    }


    //função pra preencher a matriz
    public static void preencherMatriz(Scanner scanner, int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+ (i+1) +"][" +(j+1) + "]:");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static int[][] multiplicarMatrizes(int[][] matrizA, int[][] matrizB) {
        int linhas = matrizA.length;
        int colunas = matrizB[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                int produto = 0;
                for (int k = 0; k < matrizB.length; k++) {
                    produto += matrizA[i][k] * matrizB[k][j];
                }
                resultado[i][j] = produto;
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
