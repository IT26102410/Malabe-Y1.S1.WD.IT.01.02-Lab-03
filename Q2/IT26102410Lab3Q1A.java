import java.util.Scanner;

public class IT26102410Lab3Q3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        double amount = pricePerKg * kilograms;

        System.out.println("Amount you have to pay: Rs. " + amount);
    }
}