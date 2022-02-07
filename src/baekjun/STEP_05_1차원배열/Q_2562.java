package baekjun.STEP_05_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int idx = 0;

        String[] a = new String[9];
        for(int i=0 ; i<9 ; i++){
            a[i] = br.readLine();
        }

        for(int i=0 ; i<a.length ; i++){
            if(Integer.parseInt(a[i]) > max){
                max = Integer.parseInt(a[i]);
                idx = i+1;
            }
        }

        System.out.println(max);
        System.out.println(idx);
    }
}
