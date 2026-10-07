import java.util.Scanner;

public class IT26102410Lab3Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amount;

        int note5000 = 0;
        int note1000 = 0;
        int note500 = 0;
        int note200 = 0;
        int note100 = 0;
        int note50 = 0;
        int note20 = 0;
        int note10 = 0;
        int note5 = 0;
        int note2 = 0;
        int note1 = 0;

        System.out.print("Enter the rupee amount: ");
        amount = input.nextInt();

        note5000 = amount / 5000;
        amount = amount % 5000;

        note1000 = amount / 1000;
        amount = amount % 1000;

        note500 = amount / 500;
        amount = amount % 500;

        note200 = amount / 200;
        amount = amount % 200;

        note100 = amount / 100;
        amount = amount % 100;

        note50 = amount / 50;
        amount = amount % 50;

        note20 = amount / 20;
        amount = amount % 20;

        note10 = amount / 10;
        amount = amount % 10;

        note5 = amount / 5;
        amount = amount % 5;

        note2 = amount / 2;
        amount = amount % 2;

        note1 = amount / 1;

        System.out.println("5000 Notes - " + note5000);
        System.out.println("1000 Notes - " + note1000);
        System.out.println("500 Notes  - " + note500);
        System.out.println("200 Notes  - " + note200);
        System.out.println("100 Notes  - " + note100);
        System.out.println("50 Notes   - " + note50);
        System.out.println("20 Notes   - " + note20);
        System.out.println("10 Notes   - " + note10);
        System.out.println("05 Notes   - " + note5);
        System.out.println("02 Notes   - " + note2);
        System.out.println("01 Notes   - " + note1);

        
    }
}