import java.util.Scanner;

public class IT26102410Lab3Q4{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int digit1, digit2, digit3, digit4, digit5;

        System.out.print("Enter a five digit number: ");
        number = input.nextInt();

        digit1 = number / 10000;
        number = number % 10000;

        digit2 = number / 1000;
        number = number % 1000;

        digit3 = number / 100;
        number = number % 100;

        digit4 = number / 10;
        digit5 = number % 10;

        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    }
}