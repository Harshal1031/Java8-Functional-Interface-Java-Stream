package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
     List<Integer> ls=List.of(2,4,5,7,12,3,61,70);//Unmodifiable list
     
     List<Integer> ls2=new ArrayList<Integer>();
     ls2.add(1);
     ls2.add(3);
     ls2.add(2);
     ls2.add(8);
     ls2.add(9);
     ls2.add(112);
     List<Integer> ls3=Arrays.asList(12,23,66,43,7,876,3,4,8);//Unmodifiable list
     //Normal Way without Stream
        List<Integer> lsEven=new ArrayList<>();
        for(Integer i: ls) {
        	if(i%2==0) {
        		lsEven.add(i);
        	}
        }
        System.out.println(ls);
          System.out.println(lsEven);
          // Using Stream API
          Stream<Integer> stm=ls.stream();
          List<Integer> lsEven2= stm.filter(i->i%2==0).collect(Collectors.toList());
          System.out.println("Using Stream");
          System.out.println(lsEven2);
          
          //ls3 i>10 using stream
          List<Integer> lsNew=  ls3.stream().filter(i->i>10).collect(Collectors.toList());
          System.out.println(lsNew);
          
          
          //Using Stream
          List<Integer> ls4;
          ls4=ls3.stream().filter(n->n%2==0).collect(Collectors.toList());
              //storing data in stream->Filter->collect->into List
          System.out.println(ls4);
          //Direct Print
          ls3.stream().filter(n->n%2!=0).forEach(n->System.out.print(n+" "));
          System.out.println();
          //we can do the same 
          ls3.stream().filter(n->n%2!=0).forEach(System.out::println);

         
	}

}
