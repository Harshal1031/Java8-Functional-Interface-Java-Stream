package com.preadicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	String ename;
	int salary;
	int exp;
	public Employee(String ename, int salary, int exp) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", salary=" + salary + ", exp=" + exp + "]";
	}
	
	
}

public class Demo2Predicate {

	public static void main(String[] args) {
       Employee emp=new Employee("Harshal Malviya", 50000, 4);
       Predicate<Employee> p=e->(e.salary>30000&&e.exp>3);
       System.out.println(p.test(emp));
       
       //Multiple Employee Object
       ArrayList<Employee> al= new ArrayList<Employee>();
       al.add(new Employee("Harshal", 50000, 4));
       al.add(new Employee("Shubham", 40000, 4));
       al.add(new Employee("Amol", 70000, 5));
       al.add(new Employee("Santosh", 30000, 2));
       al.add(new Employee("Ravi", 20000, 4));
       for(Employee employee:al) {
    	   if(p.test(employee)) {
    		   System.out.println(employee.toString());
    	   }
       }

       
  	}

}
