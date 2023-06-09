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
	//	try {
		  
		    Scanner obj = new Scanner(System.in);
	      	int t = obj.nextInt();
	    
	         while(t>0){
		         t--;
		      int a=obj.nextInt();
		      int b=obj.nextInt();
		         if(a==b){
		        System.out.println("ANY");
		         }
		         else if(a<b){
		        System.out.println("FIRST");
		        }
		         else{
		        System.out.println("SECOND");
		        }
		
		}
	//	} catch(Exception e) {
	//	    return;
	//	}
			
	}
}