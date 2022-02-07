package practice;
import java.util.*;


public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void checkPalindrome()
	{
		System.out.println("Enter a number to check for palindrome");
		int num = sc.nextInt();
		String s = String.valueOf(num);
		StringBuffer sb = new StringBuffer(s);
		StringBuffer s1 = sb.reverse();
		if(s1.equals(s1))
		{
			System.out.println("The given "+num+" is a palindrome");
		}
		else
		{
			System.out.println("The given "+num+" is not a palindrome");
		}
		
	}
	public static void printPattern()
	{
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for(int i = num; i>0 ; i--)
		{
			for(int j=0; j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void checkPrimeNumber()
	{
		System.out.println("Enter a number to check for prime");
		int num = sc.nextInt();
		int co = 0;
		for(int i=2; i<num;i++)
		{
			if(num%i == 0)
			{
				co++;
			}
		}
		if(co!=0)
		{
			System.out.println("The given "+num+" is not prime");
		}
		else
		{
			System.out.println("The given "+num+" is prime");
		}
	}
	public static void printFibonacciSeries()
	{
		int first=0,second=1;
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int result;
		System.out.print(first+" ");  
		System.out.print(second+" ");
		for(int i=2;i<num;i++)
		{
			result = first+second;
			System.out.print(result+" ");    
			first = second;
			second = result;
		}
		
	}

	public static void main(String[] args) {
		
		int choice;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

			+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();
			choice = sc.nextInt();
			switch (choice) {
			case 0:
				choice = 0;
				break;
			case 1: {
				checkPalindrome();
				break;
			}

			case 2: {

			printPattern();
			break;

			}
			case 3: {
				checkPrimeNumber();
				break;

			}

			case 4: {
				printFibonacciSeries();
				break;

			}
			default:

			System.out.println("Invalid choice. Enter a valid no.\n");

			}
				} while (choice != 0);
			System.out.println("Exited Successfully!!!");
			sc.close();
		
	}

}
