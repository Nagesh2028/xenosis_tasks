package org.xenosis.assignment5;

public class Exceptions {
		public static void main(String[]args) {
			try {
				int a=20;
				int b=0;
				int c=a/b;
				System.out.println(c);
			}
				catch(Exception e) {
					System.out.println("Can't be Divided by Zero");
				}
			finally{
				System.out.println("Finally Block Executed");
			}
		}

	}
