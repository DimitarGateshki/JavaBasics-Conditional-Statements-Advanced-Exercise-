package NewHouse;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan =new Scanner(System.in);
        String fla = scan.nextLine();
        int col =Integer.parseInt(scan.nextLine());
        double budg=Double.parseDouble(scan.nextLine());
        double price = 0;
        double fp=0;
        switch (fla){
            case "Roses":
                price=5;
                if (col>80){
                    fp=(col*price)*0.9;
                }else {
                    fp=col*price;
                }
                break;

            case "Dahlias":
                price=3.8;
                if (col>90){
                    fp=(col*price)*0.85;
                }else {
                    fp=col*price;
                }

                break;

            case "Tulips":
                price=2.8;
                if (col>80){
                    fp=(col*price)*0.85;
                }else {
                    fp=col*price;
                }
                break;

            case "Narcissus":
                price=3;
                if (col<120){
                    fp=(col*price)*1.15;
                }else {
                    fp=col*price;
                }
                break;

            case "Gladiolus":
                price=2.5;
                if (col<80){
                    fp=(col*price)*1.20;
                }else {
                    fp=col*price;
                }
                break;

        }
        double rest=0;
        if (fp<=budg){
            rest=budg-fp;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",col,fla,rest);
        }else{
            rest=fp-budg;
            System.out.printf("Not enough money, you need %.2f leva more.",rest);
        }


    }
}
