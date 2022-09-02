package day11;

import java.util.Scanner;



public class SalesApp {
    private static final int TARGET = 10000;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Today's Sales");
        int sales = scanner.nextInt();

        int bonus = 0;

        if (sales >= 2 * TARGET) {
            // performace = "Excellent";
            // bonus = 1000;
            bonus += 1000;
        } else if (sales >= 1.5 * TARGET) {
            // performace = "Fine";
            //  bonus = 500;
            bonus += 1000;
        } else if (sales >= TARGET) {
            //  performance = "Satisfactory";
            //   bonus = 100;
            bonus += 1000;
        } else {
            bonus += 0;
        }
            //    System.out.println(You're Fired');

            String message = String.format("You have earned bonus = %d", bonus);
            System.out.println(message);
        }
    }



