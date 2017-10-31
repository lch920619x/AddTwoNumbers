package com.lch920619x.AddTwoNumbers;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Add {

	public List<Integer> add(List<Integer> l1, List<Integer> l2){
		Iterator<Integer> itr1 =  l1.iterator();
		Iterator<Integer> itr2 =  l2.iterator();
		List<Integer> result = new LinkedList<Integer>();
		int carry = 0;
		int temp;
		while (itr1.hasNext()||itr2.hasNext()) {
			if (itr1.hasNext()&&itr2.hasNext()) {
			temp=itr1.next()+itr2.next();
			}else if(itr1.hasNext()) {
				temp=itr1.next();
			}
			else {
				temp=itr2.next();
			}
			result.add(temp%10+carry);
			carry=0;
			if (temp>9) {
				carry=1;
			}
		}
		if (carry ==1){
			result.add(1);
		}
		
		return result;

	}
}
