package baekjun.STEP_01_입출력과_사칙연산;

import java.util.Scanner;

public class Q_10869 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        scan.close();
    }
}
