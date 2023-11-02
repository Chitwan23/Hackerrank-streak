import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = keyboards[i] + pendrives[j];
                if (sum > s)  continue;
                ans = Math.max(ans, sum);
            }  
        }
        System.out.println(ans);
    }
}
