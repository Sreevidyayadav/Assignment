import java.util.*;
import java.lang.*;
import java.io.*;

class JerryChase {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    if(x<y){
		        System.out.println("yes, Tom will be able to catch Jerry.");
		    }
		    else{
		        System.out.println("no,Tom will not be able to catch Jerry.");
		    }
		}
	}
}
