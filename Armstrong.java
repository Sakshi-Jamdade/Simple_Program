package com.Logical;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int no=sc.nextInt();
		
		int arm=0;
		int n1=no;
		while(n1>0)
		{
			int i=n1%10;
			arm=arm+(i*i*i);
			n1=n1/10;	
		}
		if(arm==no)
		{
			System.out.println(arm);
			System.out.println("Is Armstrong No.");
		}
		else
		{
			System.out.println(arm);
			System.out.print(no);
			System.out.println("Is Not Armstrong no.");
		}
		
	}

}
