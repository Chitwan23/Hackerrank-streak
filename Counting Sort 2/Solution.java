import java.io.*;
import java.util.*;

public class Solution {

    public static int[] count(int[] ar, int max){
        int[] counts = new int[max+1];
        for(Integer n : ar){
            counts[n] += 1;
        }
        return counts;
    }

    public static void printCount(int[] counts){
        for(int i = 0; i < counts.length; ++i){
            for(int j = 0; j < counts[i]; ++j){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        int[] counts = count(ar, 99);
       // printArray(counts);
        printCount(counts);

    }

}
