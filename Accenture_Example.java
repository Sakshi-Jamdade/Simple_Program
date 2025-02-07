package com.Logical;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Accenture_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size Of Numbers:");
		int n=sc.nextInt();
		
	
		int a[]=new int[n];
		
		System.out.println("Enter "+n+" Numbers:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("The Numbers Are:");
		for(int i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
				if((a[i]%2==0) && (a[j]%2==0))
				{
					a[0]=a[i]*a[j];
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		
		/*
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		System.out.println("Enter "+n+" Numbers:");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			a.add(num);
		}
		
		for(int s:a)
		{
			System.out.print("\t"+s);
		}
		
		ArrayList<Integer> s=new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<a.size()-1;j++)
			{
				if((a.get(0)%2==0 && a.get(1)%2==0) || (a.get(0)%2==1 && a.get(i+1)%2==1))
				{
					int mul=a.get(i)*a.get(i+1);
					s.add(mul);
				}
				else
				{
					int temp=a.get(i);
					s.add(temp);
				}
			}
		}
		
		for(int i:s)
		{
			System.out.println("\t"+i);
		}
		*/
		
		
			
	}

}
