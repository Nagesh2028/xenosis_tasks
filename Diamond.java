package org.xenosis.assignment3;

public class Diamond {
	public static void main(String[]args)
	{
		int row=18,a;
		for(a=1;a<=row;a=a+2)
		{
			if(row/2>=a){
			for(int s=row/2;s>a;s=s-2)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++)
			{
				System.out.print("*");
			}
			}else{
			for(int v=row/2;v<a;v=v+2)
			{
				System.out.print(" ");
			}
			for(int b=row;b>a;b--)
			{
				System.out.print("*");
			}
			}
			System.out.println();
		}
	}

}
