/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int sum=a+b;
		    int digit[]={6,2,5,5,4,5,6,3,7,6};
		    int totMatches=0;
		    while(sum>0){
		        int lastDigit=sum%10;
		        totMatches+=digit[lastDigit];
		        sum/=10;
		    }
		    System.out.println(totMatches);
		}
		
	}
}
