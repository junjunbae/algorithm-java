package baekjun.STEP_03_for문;

import java.io.*;
import java.util.StringTokenizer;

public class Q_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        int n = Integer.parseInt(br.readLine());

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<i+1 ; j++){
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
