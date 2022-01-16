package baekjun.STEP_03_for문;

import java.io.*;

public class Q_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0 ; i<n ; i++){
            bw.write(i+1+"\n");
        }
        bw.flush();
        bw.close();
    }
}
