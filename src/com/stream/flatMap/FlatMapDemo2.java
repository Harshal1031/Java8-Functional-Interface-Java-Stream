package com.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
        List<String> list1=Arrays.asList("Scott","David","John");
        List<String> list2=Arrays.asList("Mary","Luna","Tom");
        List<String> list3=Arrays.asList("Ken","Jony","Kitty");
        
        List<List<String>> master=Arrays.asList(list1,list2,list3);
        //From the three List give the name having length less then 5;
         //with out stream java 8
           for(List<String> e:master) {
        	   for(String s:e) {
        		   if(s.length()<5) {
        			   System.out.print(s+" ");
        		   }
        	   }
           }
           System.out.println();
           
           //Using Stream java 8
           
           System.out.println(master.stream().flatMap(n->n.stream()).filter(n->n.length()<5).collect(Collectors.toList()));

        
	}

}
