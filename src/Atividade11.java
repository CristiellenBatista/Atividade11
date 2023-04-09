import java.util.Scanner;

public class Atividade11{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        double num3, produto, soma, cubo;
        System.out.println("Digite o primeiro número inteiro: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        num2 = input.nextInt();
        System.out.println("Digite o número real: ");
        num3 = input.nextDouble();

        produto = (2 * num1) * (num2 / 2);
        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + produto);

        soma = (3 * num1) + num3;
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + soma);

        cubo = Math.pow(num3, 3);
        System.out.println("O terceiro elevado ao cubo é: " + cubo);
    }

}
