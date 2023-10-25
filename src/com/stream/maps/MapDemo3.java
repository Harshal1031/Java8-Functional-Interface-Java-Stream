package com.stream.maps;

import java.util.Arrays;
import java.util.List;

public class MapDemo3 {

	public static void main(String[] args) {
        List<Integer> num= Arrays.asList(2,5,8,7,9,1,6,11);
        //Multiply ever element by three and print
        System.out.println("Numbers*3 ::");
        num.stream()
        .map(num1->num1*3)
        .forEach(n->System.out.print(n+" "));
        
	}

}
