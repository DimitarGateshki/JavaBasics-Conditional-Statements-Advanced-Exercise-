package FishingBoat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double budg=Double.parseDouble(scan.nextLine());
        String season=scan.nextLine();
        int people=Integer.parseInt(scan.nextLine());
        double price=0;
        double fp=0;
        double rest=0;

        switch (season) {
            case "Spring":
                price=3000;
                break;
            case "Autumn" :
                price=4200;
                break;
            case "Summer" :
                price=4200;
                break;
            case "Winter" :
                price=2600;
                break;
        }
        if (people<=6 ){
            fp=price*0.9;

        }else if (people>6 && people<=11){
            fp=price*0.85;
        }else {
            fp=price*0.75;
        }
        if (people%2==0 && !season.equals("Autumn")){
            fp=fp*0.95;

        }

        if (fp<=budg){
            rest=budg-fp;
            System.out.printf("Yes! You have %.2f leva left.",rest);

        }else {
            rest=fp-budg;
            System.out.printf("Not enough money! You need %.2f leva.",rest);

        }




    }
}
