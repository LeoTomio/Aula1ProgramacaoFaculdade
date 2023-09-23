import java.util.Scanner;

public class ativ3 {
    public static void main(String[] args) {
    /*.
     Escreva um programa que recebe dois números inteiros e encontra o MDC (máximo
     divisor comum) e o MMC (mínimo múltiplo comum) entre eles.
    */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite dois números inteiros:");

        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();

        int mdc = calcularMDC(numero1, numero2);
        int mmc = (numero1 * numero2) / mdc;

        System.out.println("O MDC entre " + numero1 + " e " + numero2 + " é: " + mdc);
        System.out.println("O MMC entre " + numero1 + " e " + numero2 + " é: " + mmc);

        leitor.close();
    }
    //Calculo do MDC usando o  algoritmo euclides
    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
