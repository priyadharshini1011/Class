package JavaHackaton;

import java.util.Scanner;

public class BooleanTrue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the boolean value");
		boolean a = sc.nextBoolean();
		System.out.println("enter the boolean value");
		boolean b = sc.nextBoolean();
		System.out.println("enter the boolean value");
		boolean c = sc.nextBoolean();
		int count =0 ;
		if(a == true)
		{
			count ++;
		}
		if(b == true)
		{
			count ++;
		
		}
		if ( c== true)
		{
			count ++;
			
		}
			if(count > 1)
			{
				System.out.println("two out of the three boolean are true");
			}
			else
				System.out.println("All the given value are false");
	}
}
