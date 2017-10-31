package com.lch920619x.AddTwoNumbers;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new LinkedList<>();
		List<Integer> l2=new LinkedList<>();
		Scanner sc = new Scanner(System.in);
/*		l1.add(5);	
		l1.add(4);	
		l1.add(6);	
		l2.add(6);	
		l2.add(1);	
		l2.add(9);	
	*/	

		System.out.println("Now key in number 1:");
		int num1 = sc.nextInt();
		while (num1%10>0)
		{
			l1.add(num1%10);
			num1=num1/10;
		}
		
		System.out.println("Now key in number 2:");
		int num2 = sc.nextInt();
		while (num2%10>0)
		{
			l2.add(num2%10);
			num2=num2/10;
		}
		
		
		Add add = new Add();
		List<Integer> result = add.add(l1, l2);
		
		System.out.println(result);
		sc.close();
		
	}

}
