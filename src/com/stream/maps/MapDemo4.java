package com.stream.maps;

import java.util.ArrayList;
import java.util.List;



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

public class MapDemo4 {

	public static void main(String[] args) {
        List<product> lsP=new ArrayList<product>();
        lsP.add(new product(1,"Samsung",50000));
        lsP.add(new product(2,"Nokia",25000));
        lsP.add(new product(3,"OnePlus",30000));
        lsP.add(new product(4,"OPPO",19000));
        lsP.add(new product(5,"RedMe",23000));
         //if price is>25000 discount = 10%
        lsP.stream()
        .filter(p->p.price>25000)
        .map(p-> p.price*0.1)
        .forEach(p->System.out.println(p))
        ;
	}

}
