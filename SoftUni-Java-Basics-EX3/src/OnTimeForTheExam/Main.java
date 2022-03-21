package OnTimeForTheExam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hourIZ=Integer.parseInt(scan.nextLine());
        int minIZ=Integer.parseInt(scan.nextLine());
        int hourST=Integer.parseInt(scan.nextLine());
        int minST=Integer.parseInt(scan.nextLine());

        int hourIZINM=hourIZ*60;
        int hourSTINM=hourST*60;

        int isTime=hourIZINM+minIZ;
        int stTime=hourSTINM+minST;


        if (stTime>isTime){
            System.out.println("Late")
            ;int afterM=stTime-isTime;
            if (afterM<60) {
                System.out.printf("%d minutes after the start", afterM);
            }else {
                int afteryHours = afterM / 60;
                int afterMin = afterM % 60;
                System.out.printf("%d:%02d hours after the start", afteryHours, afterMin);
            }
        }else if (stTime==isTime || isTime-stTime<=30){
            System.out.println("On time");
            int earlyM30=isTime-stTime;
            if (stTime!=isTime) {
                System.out.printf("%d minutes before the start", earlyM30);
            }
        }else if(isTime-stTime>30) {
            System.out.println("Early");
            int earlyM=isTime-stTime;
            if (earlyM<60){
                System.out.printf("%d minutes before the start",earlyM);
            }else {
                int earlyHours=earlyM/60;
                int earlyMin=earlyM % 60;
                System.out.printf("%d:%02d hours before the start",earlyHours,earlyMin);
            }
        }





    }


}
