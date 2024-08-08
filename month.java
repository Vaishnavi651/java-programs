package program;

import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select a number  between 1 to 12 to get a month");
		int n = sc.nextInt();
		switch(n)
		{
		case 1 :
			System.out.println("january");
			break;
		case 2 :
			System.out.println("february");
			break;
		case 3:
			System.out.println("march");
			break;
		case 4 :
			System.out.println("April");
			break;
		case 5 :
			System.out.println("may");
			break;
		case 6 :
			System.out.println("june");
			break;
		case 7 :
			System.out.println("july");
			break;
		case 8 :
			System.out.println("august");
			break;
		case 9 :
			System.out.println("sepetember");
			break;
		case 10 :
			System.out.println("october");
			break;
		case 11 :
			System.out.println("november");
			break;
		case 12 :
			System.out.println("december");
		    break;
		    
			
			
		}

	}

}
