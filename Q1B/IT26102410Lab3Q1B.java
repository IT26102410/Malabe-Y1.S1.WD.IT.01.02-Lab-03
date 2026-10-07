import java.util.Scanner;

public class IT26102410Lab3Q1B{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = input.nextDouble();

        double totalBill = pricePerKg * kilograms;
        double discount = totalBill * 0.10;
        double amountToPay = totalBill - discount;

        System.out.println("Total Bill: Rs. " + totalBill);
        System.out.println("Discount (10%): Rs. " + discount);
        System.out.println("Amount to Pay: Rs. " + amountToPay);
    }
}