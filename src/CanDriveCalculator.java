import java.util.Scanner;


public class CanDriveCalculator {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmanciped = scanner.nextBoolean();
        var canDrive = age >= 18 || isEmanciped && age >= 16;
        System.out.printf("Você pode dirigir? (%s) \n", canDrive);
    }
}
