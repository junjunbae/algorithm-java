package baekjun.STEP_02_if문;

import java.util.Scanner;

public class Q_1330 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int result = in.nextInt() - in.nextInt();

        if(result > 0){
            System.out.println(">");
        }else if (result == 0){
            System.out.println("==");
        }else{
            System.out.println("<");
        }
    }
}
