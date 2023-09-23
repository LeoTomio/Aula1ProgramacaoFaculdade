import java.util.Scanner;

public class ativ2 {
    public static void main(String[] args) {
    /*.
     Escreva um programa que recebe três valores inteiro e mostra a soma dos dois maiores
    entre eles.
    */
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite três números inteiros:");

        int numero1 = leitor.nextInt();
        int numero2 = leitor.nextInt();
        int numero3 = leitor.nextInt();

        int maior, segundoMaior;

        if (numero1 >= numero2 && numero1 >= numero3) {
            maior = numero1;
            segundoMaior = (numero2 >= numero3) ? numero2 : numero3;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maior = numero2;
            segundoMaior = (numero1 >= numero3) ? numero1 : numero3;
        } else {
            maior = numero3;
            segundoMaior = (numero1 >= numero2) ? numero1 : numero2;
        }

        int soma = maior + segundoMaior;
        System.out.println("A soma dos dois maiores números (" + maior + "," + segundoMaior + ") é: " + soma);

        leitor.close();
    }
}
