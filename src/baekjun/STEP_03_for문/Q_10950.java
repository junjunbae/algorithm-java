package baekjun.STEP_03_for문;

import java.util.Scanner;

public class Q_10950 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int i=0 ; i<n ; i++){
            System.out.println(in.nextInt()+in.nextInt());
        }
    }
}
