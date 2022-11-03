package com.bridgelabz;
import java.util.Scanner;

class Calculation{
    static double length(int x1,int y1, int x2, int y2){
        double length = Math.sqrt((double)((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
        System.out.println("The line length 1 is :" + length);
        return length;
    }
}
public class LineComparison extends Calculation {

    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        // input co=ordinate of line 1
        System.out.println("Enter the value of X1 in line 1");
        int x1 = Sc.nextInt();
        System.out.println("Enter the value of Y1 in line 1");
        int y1 = Sc.nextInt();
        System.out.println("Enter the value of X2 in line 1");
        int x2 = Sc.nextInt();
        System.out.println("Enter the value of Y2 in line 1");
        int y2 = Sc.nextInt();

        Calculation obj = new Calculation();
        obj.length(x1,y1,x2,y2);
    }
}
