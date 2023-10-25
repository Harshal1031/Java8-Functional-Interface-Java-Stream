package com.preadicate;

import java.util.function.Predicate;

public class DemoPreadicate {

	public static void main(String[] args) {
		Predicate<Integer> p = i->(i>10);//It will check if i i greater then 10 or not
		System.out.println(p.test(11));//Return Boolean
		System.out.println(p.test(5));
		//Ex 2
		Predicate<String> ps=str->(str.length()>5);
		System.out.println(ps.test("Harshal"));
		System.out.println(ps.test("Maal"));
		//Ex3
         String names []= {"Harshal","Ram","Shubham","Amol","Santosh"};
         for(String name:names) {
        	 if(ps.test(name)) {
        		 System.out.print(name+" ");
        	 }
         }
	}

}
