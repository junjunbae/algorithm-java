package baekjun.STEP_05_1차원배열;

import java.io.*;
import java.util.*;

public class Q_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;

        String[] a = br.readLine().split(" ");

        for(int i=0 ; i<n ; i++){
            if(Integer.parseInt(a[i]) > l) l = Integer.parseInt(a[i]);
            if(Integer.parseInt(a[i]) < s) s = Integer.parseInt(a[i]);
        }

        System.out.println(s + " " + l);
    }
}

/*
public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] a = new int[n];

    for(int i=0 ; i<n ; i++){
        a[i] = Integer.parseInt(st.nextToken());
    }

    Arrays.sort(a);
    System.out.println(a[0] + " " + a[n-1]);
}
* */