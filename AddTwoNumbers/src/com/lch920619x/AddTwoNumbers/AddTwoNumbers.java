package com.lch920619x.AddTwoNumbers;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1=new LinkedList<>();
		List<Integer> l2=new LinkedList<>();
		
/*		l1.add(5);	
		l1.add(4);	
		l1.add(6);	
		l2.add(6);	
		l2.add(1);	
		l2.add(9);	
	*/	

		Add add = new Add();
		List<Integer> result = add.add(l1, l2);
		
		System.out.println(result);
		
	}

}
