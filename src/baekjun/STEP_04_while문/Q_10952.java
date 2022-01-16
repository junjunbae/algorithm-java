package baekjun.STEP_04_while문;

import java.io.*;
import java.util.*;

public class Q_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int tmp = 0;

        while(true){
            st = new StringTokenizer(br.readLine());
            tmp = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            if(tmp == 0) break;
            else bw.write(tmp+"\n");
        }
        bw.flush();
        bw.close();

    }
}
