package com.comsumer;

import java.util.function.Consumer;

public class Demo2ConsumerChaning {

	public static void main(String[] args) {
           Consumer<String> c1=str->System.out.println(str+" is form Bhusawal");
           Consumer<String> c2=str->System.out.println(str+" is now Shifted to Mumbai");
           Consumer<String> c3=str->System.out.println(str+" Currently Working As SDET.");
           c1.andThen(c2).andThen(c3).accept("Harshal");
           
           //Another Method
           Consumer<String> c4=c1.andThen(c2).andThen(c3);
           System.out.println();
           c4.accept("Harshal");

	}

}
