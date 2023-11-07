import java.util.LinkedList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        int index;
        
        for(int i = 0; i < n; i++)
        {
            list.add(in.nextInt()); 
        }
        
        while(k > 0)
        {
            int j = list.removeLast();
            list.push(j);
            k--;
        }
        
        while(q > 0)
        {
            index = in.nextInt();
            System.out.println(list.get(index));
            q--;
        }
        in.close();
    }

    
}
