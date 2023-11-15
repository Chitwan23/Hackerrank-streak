

import java.util.*;
class Solution
{
	static int min(int[] arr,int entry,int exit)
	{
		int low=arr[entry];
		for(int i=entry+1;i<=exit;i++)
		{
			if(low>arr[i])
			{
				low=arr[i];
			}
		}
		return low;
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int length=in.nextInt();
		int test=in.nextInt();
		int[] l=new int[length];
		for(int i=0;i<length;i++)
		{
			l[i]=in.nextInt();
		}
		for(int i=0;i<test;i++)
		{
			int entry=in.nextInt();
			int exit=in.nextInt();
			int low=min(l,entry,exit);
			System.out.println(low);
		}
	}
}
