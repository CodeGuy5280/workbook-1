import java.util.Scanner;

public class Main {
    //parsDouble as floating point
    //use Double and int
    //refer back to notes from Thursday for formatting
    //
    public static void main(String[] args) {
    //allowing user to provide input
        Scanner scanner = new Scanner(System.in);
    //printing for user input allowing typing
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
    //printing for user input allowing typing
        System.out.print("Enter the second number: " );
        int num2 = scanner.nextInt();
    //declaring total variable to store result of num1 & num2
        int total = num1 / num2;
    //print the total
        System.out.print("Total is: " + total);

    }
}
