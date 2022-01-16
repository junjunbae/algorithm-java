package baekjun.STEP_01_입출력과_사칙연산;

import java.util.Scanner;

public class Q_2588 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        in.close();

        System.out.println(num1 * (num2%10));
        System.out.println(num1 * (num2 % 100 / 10));
        System.out.println(num1 * (num2/100));
        System.out.println(num1 * num2);
    }
}
