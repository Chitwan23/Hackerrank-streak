import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];

        for (int c_i = 0; c_i < n; c_i++) {
            c[c_i] = in.nextInt();
        }

        int result = jumpingOnClouds(c, k);
        System.out.println(result);
    }

    static int jumpingOnClouds(int[] c, int k) {
        int cur = k % c.length;
        int energy = 100 - 1 - c[cur] * 2;

        while (cur != 0) {
            cur = (cur + k) % c.length;
            energy -= 1 + c[cur] * 2;
        }

        return energy;
    }
}
