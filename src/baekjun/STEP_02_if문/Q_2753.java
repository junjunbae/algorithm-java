package baekjun.STEP_02_if문;

import java.util.Scanner;

public class Q_2753 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        if((num1%4==0&&num1%100!=0)||num1%400==0) System.out.println("1");
        else System.out.println("0");
    }
}
