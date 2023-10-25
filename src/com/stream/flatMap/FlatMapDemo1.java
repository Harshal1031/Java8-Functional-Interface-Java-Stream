package com.stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

	public static void main(String[] args) {
          List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8);
          List<Integer> list2=list1.stream().map(n->n*2).collect(Collectors.toList());
          System.out.println(list1+" "+list2);
          //Use Of Flat Map
          List<List<Integer>> listF=Arrays.asList(list1,list2);
           
          System.out.println(listF.stream().flatMap(x->x.stream()).collect(Collectors.toList()));
	}

}
