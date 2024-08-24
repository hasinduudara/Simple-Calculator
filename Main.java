import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);

    private static void clearConsole() {
        final String os = System.getProperty("os.name");
        try {
            if (os.contains("Linux") || os.contains("Mac")) {
                System.out.print("\033\143");
            } else if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void menu() {
        System.out.println("Simple Calculator");
        System.out.println();

        System.out.println("Option 1: Addition");
        System.out.println("Option 2: Subtraction");
        System.out.println("Option 3: Multiplication");
        System.out.println("Option 4: Division");

        System.out.println();

        System.out.print("Enter Option Number: ");
        int option = input.nextInt();
        input.nextLine();
        switch (option) {
            case 1:
                clearConsole();
                addition();
                break;
            case 2:
                clearConsole();
                subtraction();
                break;
            case 3:
                clearConsole();
                multiplication();
                break;
            case 4:
                clearConsole();
                division();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                menu();
                break;
        }
    }

    public static void menuSelection() {
        System.out.print("Go To Menu...?  (Y / N): ");
        String yesOrNo = input.nextLine();
        if (yesOrNo.equalsIgnoreCase("y")) {
            clearConsole();
            menu();
        } else {
            System.out.println("System Is Exit...");
        }
    }

    public static void addition() {
        System.out.println("Simple Calculator");

        System.out.print("Enter Value 1: ");
        double valOne = input.nextDouble();

        System.out.print("Enter Value 2: ");
        double valTwo = input.nextDouble();

        System.out.println();

        System.out.println("Addition is: " + (valOne + valTwo));

        System.out.println();

        input.nextLine();
        menuSelection();
    }

    public static void subtraction() {
        System.out.println("Simple Calculator");

        System.out.print("Enter Value 1: ");
        double valOne = input.nextDouble();

        System.out.print("Enter Value 2: ");
        double valTwo = input.nextDouble();

        System.out.println();

        System.out.println("Subtraction is: " + (valOne - valTwo));

        System.out.println();

        input.nextLine();
        menuSelection();
    }

    public static void multiplication() {
        System.out.println("Simple Calculator");

        System.out.print("Enter Value 1: ");
        double valOne = input.nextDouble();

        System.out.print("Enter Value 2: ");
        double valTwo = input.nextDouble();

        System.out.println();

        System.out.println("Multiplication is: " + (valOne * valTwo));

        System.out.println();

        input.nextLine();
        menuSelection();
    }

    public static void division() {
        System.out.println("Simple Calculator");

        System.out.print("Enter Value 1: ");
        double valOne = input.nextDouble();

        System.out.print("Enter Value 2: ");
        double valTwo = input.nextDouble();

        System.out.println();

        if (valTwo != 0) {
            System.out.println("Division is: " + (valOne / valTwo));
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println();

        input.nextLine();
        menuSelection();
    }

    public static void main(String[] args) {
        menu();
    }
}
