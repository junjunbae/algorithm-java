package baekjun.STEP_05_1차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        int result = stringToInt(br.readLine()) * stringToInt(br.readLine()) * stringToInt(br.readLine());
        StringBuilder sb = new StringBuilder(String.valueOf(result));

        for( int i=0 ; i<10 ; i++){
            for( int j=0 ; j<sb.length() ; j++ ){
                if( i == (sb.charAt(j)-'0') ) answer++;
            }
            System.out.println(answer);
            answer = 0;
        }
    }

    public static int stringToInt(String str){
        return Integer.parseInt(str);
    }
}
