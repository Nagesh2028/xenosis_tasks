package org.xenosis.assignment1;
import java.util.Scanner;
public class Converstion {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a decimal number: ");
	        int num = scanner.nextInt();
	        String num2 = Integer.toHexString(num);
	        System.out.println("Hexadecimal equivalent: " + num2);
	    }

		}


