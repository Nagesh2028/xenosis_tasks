package org.xenosis.assignment4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a name: ");
		String obj1 = scanner.nextLine();
		System.out.print("Enter age: ");
        int obj2 = scanner.nextInt();
        
        Person obj=new Person();
		obj.displayDetails(obj1, obj2);

	}

}
