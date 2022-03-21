package OperationsBetweenNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1 = Double.parseDouble(scan.nextLine());
        double n2 = Double.parseDouble(scan.nextLine());
        char simb = scan.nextLine().charAt(0);
        double result=0;
        switch (simb){
            case '+':
                result=n1+n2;
                if(result%2==0){
                    System.out.printf("%.0f %c %.0f = %.0f - even",n1,simb,n2,result);
                }else {
                    System.out.printf("%.0f %c %.0f = %.0f - odd",n1,simb,n2,result);
                }
                break;
            case '-':
                result=n1-n2;
                if(result%2==0){
                    System.out.printf("%.0f %c %.0f = %.0f - even",n1,simb,n2,result);
                }else {
                    System.out.printf("%.0f %c %.0f = %.0f - odd",n1,simb,n2,result);
                }
                break;
            case '*':
                result=n1*n2;
                if(result%2==0){
                    System.out.printf("%.0f %c %.0f = %.0f - even",n1,simb,n2,result);
                }else {
                    System.out.printf("%.0f %c %.0f = %.0f - odd",n1,simb,n2,result);
                }
                break;
            case '/':
                result=n1/n2;
                if(n2==0){
                    System.out.printf("Cannot divide %.0f by zero",n1);
                }else {
                    System.out.printf("%.0f %c %.0f = %.2f ",n1,simb,n2,result);
                }
                break;
            case '%':
                result=n1%n2;
                if(n2==0){
                    System.out.printf("Cannot divide %.0f by zero",n1);
                }else {
                    System.out.printf("%.0f %c %.0f = %.0f ",n1,simb,n2,result);
                }
                break;


        }



    }
}
