package com.function;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
    Function<Integer, Integer> f=n->n*n*n;
    System.out.println(f.apply(8));
    System.out.println(f.apply(81));
    System.out.println(f.apply(2));
    //length of string
        Function<String, Integer> f2=str->str.length();
       System.out.println(f2.apply("Harshal Malviya"));
       System.out.println(f2.apply("Harshal"));
       System.out.println(f2.apply("Malviya"));

	}

}
