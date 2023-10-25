package com.preadicate;

import java.util.function.Predicate;

public class Demo3Predicate {

	public static void main(String[] args) {
        int arr[]= {20,25,30,35,40,45,55,60,65,70,75};
        Predicate<Integer>p1=i->(i%2==0);
        Predicate<Integer>p2=i->i>50;
        for(int n:arr) {
//          if(p1.test(n)&&p2.test(n)) {
//        	  System.out.print(n+" ");
//          }
        	if(p1.and(p2).test(n)) {
       	  System.out.print(n+" ");

        	}
        }
        System.out.println();
        //OR used in predicate
        for(int n:arr) {
//          if(p1.test(n)&&p2.test(n)) {
//        	  System.out.print(n+" ");
//          }
        	if(p1.or(p2).test(n)) {
       	  System.out.print(n+" ");

        	}
        }
        System.out.println();
        //negate used in predicate
        for(int n:arr) {
//          if(p1.test(n)&&p2.test(n)) {
//        	  System.out.print(n+" ");
//          }
        	if(p1.negate().test(n)) {
       	  System.out.print(n+" ");

        	}
        }



	}

}
