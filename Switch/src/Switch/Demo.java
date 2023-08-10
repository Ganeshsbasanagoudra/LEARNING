package Switch;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number between");
		int num=scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("SUNDAY");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("firday");
			break;
		case 7:
			System.out.println("satursday");
			break;
		}

	}

}
