package baekjun.STEP_03_for문;

import java.util.Scanner;

public class Q_8393 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;

        for(int i=0 ; i<n ; i++){
            sum += i+1;
        }
        System.out.println(sum);
    }
}
