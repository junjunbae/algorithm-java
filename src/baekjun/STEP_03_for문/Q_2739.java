package baekjun.STEP_03_for문;

import java.util.Scanner;

public class Q_2739 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1 ; i<10 ; i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}
