package com.comsumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
class Employee{
	String ename;
	int salary;
	public Employee(String ename, int salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}
	
}

public class Demo1Consumer {

	public static void main(String[] args) {
		ArrayList<Employee> ae=new ArrayList<>();
        ae.add(new Employee("Harshal", 50000));
        ae.add(new Employee("Shubham", 20000));
        ae.add(new Employee("Amol", 30000));
        ae.add(new Employee("Santosh", 10000));
        Function<Employee, Double> f=e->{
        	double sal=e.salary;
        	if(sal>10000&&sal<=20000) {
        		return sal*0.1;
           	}else if(sal>20000&&sal<=30000) {
        		return sal*0.2;

           	}else if(sal>30000&&sal<=50000) {
        		return sal*0.3;

           	}else {
           		return sal*0.4;
           	}

        };
        Predicate<Double> p=b->(b>5000);
        Consumer<Employee> c=e->{
        	System.out.print("The name of Employee Is "+e.ename+" And The Salary is "+e.salary);
        };
        for(Employee e:ae) {
        	double bonus=f.apply(e);
        	if(p.test(bonus)) {
        		c.accept(e);
        		System.out.println(" And Bounus is "+bonus);
        	}

        }
        
        }

}
