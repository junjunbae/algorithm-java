package baekjun.STEP_02_if문;

import java.util.Scanner;

public class Q_9498 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        if(num1 >= 90) System.out.println("A");
        else if(num1 >= 80) System.out.println("B");
        else if(num1 >= 70) System.out.println("C");
        else if(num1 >= 60) System.out.println("D");
        else System.out.println("F");
    }
}
