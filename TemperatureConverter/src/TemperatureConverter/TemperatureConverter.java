package TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter f");
      double f=scan.nextDouble();
      TemperatureConverterApp d=new TemperatureConverterApp();
      double c=d.convertFahrenheitToCelsius(f);
      System.out.println(c);
	}

}
