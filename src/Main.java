import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to PassGen");
        System.out.println("Please enter a length");

        int length = input.nextInt();

        gen g = new gen(length);

        while (true) {
            System.out.println("");
            System.out.println("Please choose a method");
            System.out.println("1 - Uppercase + Numbers");
            System.out.println("2 - Uppercase + Lowercase + Numbers");
            System.out.println("3 - All Characters");
            System.out.println("4 - EXIT");

            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(g.uppergen());
                    break;
                case 2:
                    System.out.println(g.lowergen());
                    break;
                case 3:
                    System.out.println(g.puntgen());
                    break;
                case 4:
                    System.out.println("Have a nice day!");
                    System.exit(0);
                    break;
            }
        }
    }
}