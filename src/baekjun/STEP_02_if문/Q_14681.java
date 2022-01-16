package baekjun.STEP_02_if문;

import java.util.Scanner;

public class Q_14681 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {in.nextInt(), in.nextInt()};

        if(nums[0] > 0 && nums[1] > 0) System.out.println("1");
        else if(nums[0] < 0 && nums[1] > 0) System.out.println("2");
        else if(nums[0] < 0 && nums[1] < 0) System.out.println("3");
        else if(nums[0] > 0 && nums[1] < 0) System.out.println("4");
    }
}
