package HotelRoom;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mount=scan.nextLine();
        int days =Integer.parseInt(scan.nextLine());
        double apartmentP=0;
        double studioP=0;
        double finalPA=0;
        double finalPS=0;
        if (mount.equals("May")|| mount.equals("October")){

            studioP=50;
            apartmentP=65;
            finalPA=days*apartmentP;
            finalPS=days*studioP;
            if (days>7 && days<=14){
                finalPS=finalPS*0.95;
            }else if (days>14){
                finalPS=finalPS*0.70;
                finalPA=finalPA*0.90;
            }

        }else if (mount.equals("June")|| mount.equals("September")){
            studioP=75.2;
            apartmentP=68.7;;
            finalPA=days*apartmentP;
            finalPS=days*studioP;
            if (days>14){
                finalPS=finalPS*0.80;
                finalPA=finalPA*0.90;
            }
        }else {
            studioP=76;
            apartmentP=77;
            finalPA=days*apartmentP;
            finalPS=days*studioP;
            if (days>14){
                finalPA=finalPA*0.90;
            }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",finalPA,finalPS);



    }

}
