package com.function;

import java.util.function.Function;

public class Demo3FunctionChaning {

	public static void main(String[] args) {
      Function<Integer, Integer> f1=n->n*2;
      Function<Integer, Integer> f2=n->n*n*n;
      System.out.println(f1.andThen(f2).apply(2));//f1->4 f2->4*4*4=64
      System.out.println(f1.compose(f2).apply(2));//f2->2*2*2->8 f1->8*2=16


      
	}

}
