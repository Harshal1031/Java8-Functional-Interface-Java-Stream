package com.function;

import java.util.ArrayList;
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

public class Demo2 {

	public static void main(String[] args) {
        ArrayList<Employee> ae=new ArrayList<>();
        ae.add(new Employee("Harshal", 50000));
        ae.add(new Employee("Shubham", 20000));
        ae.add(new Employee("Amol", 30000));
        ae.add(new Employee("Santosh", 10000));
        Function<Employee, Double> f=e->{
        	int sal=e.salary;
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
        //Using Both Predicate And Function
        Predicate<Double> p=n->(n>5000);
        for(Employee e: ae) {
        	if(p.test(f.apply(e)))//Function And Predicate 
        	System.out.println("The name of Employee is "+e.ename+" the Salary is "+e.salary+" and the Bonus is "+f.apply(e));
        }

	}

}
