package com.stream.maps;

import java.util.Arrays;
import java.util.List;


public class MapDemo2 {

	public static void main(String[] args) {
        List<String> vehicles=Arrays.asList("bus","car","bicycle","flight","train");
             //calculate lenght of each element and add in new list
        int count=0;
        int arr[]=new int[vehicles.size()];
        for(String str:vehicles) {
        	arr[count]=str.length();
        	count++;
        }
        System.out.println(Arrays.toString(arr));
        
        //Using Java 8 Map method
        vehicles.stream()
        .map(str->str.length())
        .forEach(System.out::println);
        //
        System.out.println();
        System.out.println();

        vehicles.stream()
        .map(str->str.length())
        .forEach(sr->System.out.println(sr));

	}
	//
    
}



