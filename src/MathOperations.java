import java.util.Scanner;


public class MathOperations {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro número");
        var value1 = scanner.nextInt();
        System.out.println("Informe o segundo número");
        var value2 = scanner.nextInt();
        System.out.printf("O resultado da soma de %s + %s é de %s \n", value1, value2, value1 + value2);

        System.out.println("Informe o terceiro número");
        var value3 = scanner.nextInt();
        System.out.println("Informe o quarto número");
        var value4 = scanner.nextInt();
        System.out.printf("A divisão de %s por %s é igual a %s", value3, value4, value3 / value4);
    }
}
