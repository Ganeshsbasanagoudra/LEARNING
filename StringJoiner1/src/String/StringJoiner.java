package String;

import java.util.Scanner;

public class StringJoiner {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter first name and second name");
	String firstname1=scan.next();
	String lastname=scan.next();
	
	
	System.out.println(joinStrings(firstname1,lastname));
	
	
	
}
public static String joinStrings(String str1, String str2) {
	return str1+str2;
}


}
