    import java.util.Scanner;


    public class UserGreeting {

       private final static String WELCOME_MESSAGE = "Olá, informe seu nome";

        public static void main(String[] args) {
            var scanner = new Scanner(System.in);
            System.out.println(WELCOME_MESSAGE);
            var name = scanner.next();
            System.out.println("Informe sua idade: ");
            var age = scanner.nextInt();
            System.out.printf("Olá %s sua idade é %s \n",  name, age);
        }
    }
