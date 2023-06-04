/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Brokenstring
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		String s = read.next();
    		// Update the code below to solve the problem
    		int j=0;
    		int flag=0;
    		while(j<(n/2)){
    		    if(s.charAt(j)==(s.charAt((n/2)+j))){
    		        j++;
    		    }
    		    else{
    		        flag=1;
    		        break;
    		    }
    		}
    		if(flag==1){
    		    System.out.println("No");
    		}else{
    		    System.out.println("Yes");
    		}
    		
		}
	}
}
