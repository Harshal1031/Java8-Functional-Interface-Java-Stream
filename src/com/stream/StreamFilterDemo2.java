package com.stream;

import java.util.Arrays;
import java.util.List;

public class StreamFilterDemo2 {

	public static void main(String[] args) {
       List<String> ls=Arrays.asList("Harshal","Santosh","Amol","Shubham","Malviya","Turkar");
       
       //Check length 
       ls.stream().filter(str->str.length()>6&&str.length()<8).forEach(System.out::println);
       System.out.println();
       System.out.println();
       ///Demo3--> Remove Null From the Collection
       List<String> ls2=Arrays.asList("Harshal",null,"Santosh","Amol",null,"Shubham","Malviya",null,"Turkar");
       ls2.stream().filter(str->str!=null).forEach(System.out::println);


       
	}

}
