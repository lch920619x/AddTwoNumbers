package com.lch920619x.AddTwoNumbers;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number1 = new LinkedList<Integer>();
		List<Integer> number2 = new LinkedList<Integer>();
		number1.add(5);	
		number1.add(4);	
		number1.add(1);	
		number2.add(6);	
		number2.add(1);	
		number2.add(6);	
		

		Add add = new Add();
		List<Integer> result = add.add(number1, number2);
		
	}

}
