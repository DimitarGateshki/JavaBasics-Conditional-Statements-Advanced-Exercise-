package SummerOutfit;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        double deg =Double.parseDouble(scan.nextLine());
        String time = scan.nextLine();
        String out= " ";
        String shoes= " ";


        switch (time){
            case "Morning":
                if (deg>=10 && deg<=18){
                    out="Sweatshirt";
                    shoes= "Sneakers";
                }else if (deg>18 && deg<=24){
                    out="Shirt";
                    shoes= "Moccasins";
                }else if (deg>=25){
                    out="T-Shirt";
                    shoes= "Sandals";
                }
                break;
            case "Afternoon":
                if (deg>=10 && deg<=18){
                    out="Shirt";
                    shoes= "Moccasins";
                }else if (deg>18 && deg<=24){
                    out="T-Shirt";
                    shoes= "Sandals";
                }else if (deg>=25){
                    out="Swim Suit";
                    shoes= "Barefoot";
                }
                break;
            case "Evening":
                if (deg>=10 && deg<=18){
                    out="Shirt";
                    shoes= "Moccasins";
                }else if (deg>18 && deg<=24){
                    out="Shirt";
                    shoes= "Moccasins";
                }else if (deg>=25){
                    out="Shirt";
                    shoes= "Moccasins";
                }
                break;

        }
        System.out.printf("It's %.0f degrees, get your %s and %s.",deg,out,shoes);

    }
}
