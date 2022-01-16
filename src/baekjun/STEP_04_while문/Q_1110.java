package baekjun.STEP_04_while문;

import java.io.*;
import java.util.*;

public class Q_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(String.format("%02d", Integer.parseInt(br.readLine())));
        String str = sb.toString();
        int cycle = 1;

        while(true){
            sb.append((sb.charAt(0)-'0' + sb.charAt(1)-'0') % 10);
            sb.deleteCharAt(0);

            if(str.equals(sb.toString())) break;
            else cycle++;
        }
        System.out.println(cycle);
    }
}
