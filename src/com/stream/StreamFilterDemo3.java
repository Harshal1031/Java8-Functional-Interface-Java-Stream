package com.stream;

import java.util.*;

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

public class StreamFilterDemo3 {

	public static void main(String[] args) {
         List<product> lsP=new ArrayList<product>();
         lsP.add(new product(1,"Samsung",50000));
         lsP.add(new product(2,"Nokia",25000));
         lsP.add(new product(1,"OnePlus",30000));
         lsP.add(new product(1,"OPPO",19000));
         lsP.add(new product(1,"RedMe",23000));
         lsP.stream().filter(pro->pro.price>25000).forEach(pro->System.out.println(" The price of "+pro.name+" is :"+pro.price));

	}

}
