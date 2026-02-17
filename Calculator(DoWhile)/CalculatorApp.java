import java.util.Scanner;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}
class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        int choice;
        do {
            System.out.println("\nMENU");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int x1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int y1 = sc.nextInt();
                    System.out.println("Addition = " + calc.add(x1, y1));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    int x2 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int y2 = sc.nextInt();
                    System.out.println("Subtraction = " + calc.subtract(x2, y2));
                    break;
                case 3:
                    System.out.println("Program ended.");
                    break;
                default:
                    System.out.println("Invalid Choice!!");
            }
        } while (choice != 3);
        sc.close();
    }
}



