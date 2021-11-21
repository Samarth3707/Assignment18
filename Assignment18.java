package Assignment18;
import java.util.*;

public class Assignment18 {
public static void main(String[] args) {
		
		//1st proplem
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the 1st number");
		int a=sc.nextInt();
		System.out.print("Enter the 2nd number");
		int b=sc.nextInt();
		String s=(a==b)?"same number":"different number";
		System.out.println(s);
		
		//2nd problem
		System.out.println("Enter the 1st number");
		int d=sc.nextInt();
		System.out.println("Enter 2nd the number");
		
		int e=sc.nextInt();
		System.out.println("Enter the 3rd number");
		
		int f= sc.nextInt();
		
		
		String str=(d>e)?(d>f)?"a is gratter":"c is gratter":(f>e)?"c is gratter":"b is gratter";
		System.out.println(str);
		
		
		
		System.out.println("Enter the  number");
		int g=sc.nextInt();
		int count=0;
		
		while(g>0) {
			g=g/10;
			count++;
			
			
		}
		System.out.println(count);
		
	}

}


