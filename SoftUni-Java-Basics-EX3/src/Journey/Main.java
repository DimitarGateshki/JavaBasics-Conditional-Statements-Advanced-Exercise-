package Journey;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double budg = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String place = "";
        double price = 0;
        String country = "";

        if (budg <= 100) {
            if (season.equals("summer")) {
                place = "Camp";
                price = budg * 0.3;
                country = "Bulgaria";
            } else {
                place = "Hotel";
                price = budg * 0.7;
                country = "Bulgaria";
            }

        } else if (budg <= 1000 && budg > 100) {
            if (season.equals("summer")) {
                place = "Camp";
                price = budg * 0.4;
                country = "Balkans";
            } else {
                place = "Hotel";
                price = budg * 0.8;
                country = "Balkans";

            }
        } else if (budg > 1000) {
            place = "Hotel";
            price = budg * 0.9;
            country = "Europe";

        }

        System.out.printf("Somewhere in %s%n%s - %.2f",country,place,price);

    }

}
