package basic.dev;

import java.util.Scanner;

public class MainApp {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
			i++;
		}
		System.out.println("tong cac so tu 1 den 100 la:" + sum);
	}   
           	

}
