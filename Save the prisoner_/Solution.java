import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int c = Integer.parseInt(scan.nextLine());
        for(int i=0;i<c;i++){
            String[] sp = scan.nextLine().split("\\s+");
            int N = Integer.parseInt(sp[0]);
            int M = Integer.parseInt(sp[1]);
            int S = Integer.parseInt(sp[2]);
            int next = M+S;
            next=(next-1)%N;
            if(next == 0)next = N;
            System.out.println(next);
        }
    }
}
