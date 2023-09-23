import java.util.Scanner;

public class ativ1 {
    public static void main(String[] args) {
        /*
       O cálculo do peso (massa) ideal de uma pessoa é realizado de acordo
        com o seguinte critério:
        - para sexo masculino: peso ideal = (72.7 * altura) - 58
        - para sexo feminino: peso ideal = (62.1 * altura) - 44.7
        - Escreva um programa em C que solicita a altura de uma pessoa e seu sexo (M ou F).
        Com base nisso executa e apresenta o peso ideal desta pessoa.
        */
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe a sua altura: ");
        double altura = leitor.nextDouble();


        System.out.print("Informe o seu sexo (M/F): ");
        char sexo = leitor.next().charAt(0);

        String pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = String.format("%.2f", (72.7 * altura) - 58);
        } else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = String.format("%.2f", (61 * altura) - 44.7);
        } else {
            System.out.println("Sexo invalido");
            leitor.close();
            return;
        }
        System.out.println("O peso ideal para uma pessoa de " + altura + " metros de altura e sexo " + sexo + " é: " + pesoIdeal);
        leitor.close();
    }
}
