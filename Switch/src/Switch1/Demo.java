package Switch1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number between");
		int num=scan.nextInt();
		DemoApp demoapp=new DemoApp();
		demoapp.Switch(num);
	}

}
