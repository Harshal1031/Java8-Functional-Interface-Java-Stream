package com.stream.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class  product{
	int id;
	String name;
	double price;
	public product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}

public class FlatMapDemo3 {

	public static void main(String[] args) {
        List<product> ls1=new ArrayList<product>();
        ls1.add(new product(1,"Samsung",50000));
        ls1.add(new product(2,"Nokia",25000));
        ls1.add(new product(3,"OnePlus",30000));
        ls1.add(new product(4,"OPPO",19000));
        ls1.add(new product(5,"RedMe",23000));
        List<product> ls2=new ArrayList<product>();
        ls2.add(new product(10,"Samsung2",23000));
        ls2.add(new product(20,"Nokia2",19000));
        ls2.add(new product(30,"OnePlus2",30000));
        ls2.add(new product(40,"OPPO2",250000));
        ls2.add(new product(50,"RedMe2",50000));
        List<product> ls3=new ArrayList<product>();
        ls3.add(new product(100,"Samsung3",10000));
        ls3.add(new product(200,"Nokia3",80000));
        ls3.add(new product(300,"OnePlus3",35000));
        ls3.add(new product(400,"OPPO3",28000));
        ls3.add(new product(500,"RedMe3",51000));
        List<List<product>> masterList=Arrays.asList(ls1,ls2,ls3);
        //print the name of product having price more than 25k
        //without using stream
        List<String> ls=new ArrayList<String>();
        for(List<product> productList:masterList) {
        	for(product p:productList) {
        		if(p.price>25000) {
        			ls.add(p.name);
        		}
        	}
        }
        System.out.println(ls);
        System.out.println(
        		masterList.stream()
        		.flatMap(list->list.stream())
        		.filter(product->product.price>25000)
        		.map(n->n.name)
        		.collect(Collectors.toList())
        		);




	}

}
