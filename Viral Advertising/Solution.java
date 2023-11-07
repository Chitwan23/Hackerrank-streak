import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int received = 5;
        int sum=0;
        while(n-- >0){
            int remaining = received/2;
            sum+=remaining;
            received = remaining*3;
        }
        System.out.println(sum);

    }
}
