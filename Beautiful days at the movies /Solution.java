import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int count = 0;

        for (int a = i; a <= j; a++) {
            int aRev = reverseNumber(a);
            if (Math.abs((a - aRev) % k) == 0) {
                count++;
            }
        }

        System.out.println(count);
    }

    static int reverseNumber(int num) {
        StringBuilder temp = new StringBuilder();
        temp.append(num);
        temp = temp.reverse();
        String tempStr = temp.toString();
        return Integer.parseInt(tempStr);
    }
}
