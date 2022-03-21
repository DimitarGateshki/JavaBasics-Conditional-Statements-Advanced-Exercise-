package Cinema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String type=scan.nextLine();
        int r=Integer.parseInt(scan.nextLine());
        int c=Integer.parseInt(scan.nextLine());
        int plases=r*c;
        double value=0;
        switch (type){
            case"Premiere":
                value=plases*12;
                break;
            case"Normal":
                value=plases*7.5;
                break;
            case"Discount":
                value=plases*5;
                break;
        }
        System.out.printf("%.2f leva",value);

    }
}
