import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    



    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int x1=sc.nextInt();
         int v1=sc.nextInt();
          int x2=sc.nextInt();
           int v2=sc.nextInt();
           int i=0;
       for(i=0;i<10000;i++)
       {
           x1=x1+v1;
           x2=x2+v2;
           if(x1==x2){
           System.out.print("YES");
             System.exit(0);}
       }
       System.out.print("NO"); 
}
}
