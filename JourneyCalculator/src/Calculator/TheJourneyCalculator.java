package Calculator;

import java.util.Scanner;

public class TheJourneyCalculator {
   public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("enter speed and time to calculate distance");
	   double speed=scan.nextDouble();
	   double time=scan.nextDouble();
	   JourneyCalculator d=new JourneyCalculator();
	   System.out.println(d.calculateDistance(speed, time));
	
}


}
