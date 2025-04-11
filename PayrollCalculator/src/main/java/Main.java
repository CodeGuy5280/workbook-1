import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //open scanner to receive user input
        Scanner in = new Scanner(System.in);
        //print to the terminal for user input
        System.out.print("Enter you name: ");
        //next line
        String name = in.nextLine();
        //print to the terminal for user input
        System.out.print("Enter your hours worked: ");
        //next line
        int hours = in.nextInt();
        //print to the terminal for user input
        System.out.print("Enter your pay rate: ");
        //next line
        double rate = in.nextDouble();
        //print out final product
        double total = hours * rate;
        System.out.println("Employee " + name);
        System.out.println("Gross Pay: " + total);

    }
}
