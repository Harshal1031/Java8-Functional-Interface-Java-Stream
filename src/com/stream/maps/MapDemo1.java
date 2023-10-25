package com.stream.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
        List<String> vehicles=Arrays.asList("bus","car","bicycle","flight","train");
        //before java8
         List<String> vT=new ArrayList<String>();
         for(String str:vehicles) {
        	 vT.add(str.toUpperCase());
         }
         System.out.println(vT);
         
         //After 
         vT=vehicles.stream()
        		 .map(str->str.toUpperCase())
        		 .collect(Collectors.toList());
         System.out.println("After java 8 : "+vT);
         System.out.println();
         System.out.println();

         //Using forEach
         vehicles.stream()
		 .map(str->str.toUpperCase())
		 .forEach(System.out::println);
          
	}

}
