package baekjun.STEP_02_if문;

import java.util.Scanner;

public class Q_2884 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = {in.nextInt(), in.nextInt()};
        int m = (n[0]*60) + n[1] - 45;

        if(m < 0){
            m += (60*24);
        }
        System.out.println(m/60+" "+m%60);
    }
}
