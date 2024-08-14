package day3;

import java.util.Scanner;

public class emplyeeExp {
	String name;
	String jobtype;int yoe;double sal;double hike;
	
	public emplyeeExp(String name, String jobtype, int yoe,double  sal, double hike) {
		super();
		this.name = name;
		this.jobtype = jobtype;
		this.yoe = yoe;
		this.sal = sal;
		this.hike = hike;
	}
 
void tsal(double sal,double hike ) {
	double totsal=sal*hike/100;
	System.out.println("Total Salary:"+totsal);
	double ts=sal+totsal;
	System.out.println("overall salary:"+ts);
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emplyeeExp e=new emplyeeExp("abb", "manager", 14, 350000, 2);
		
				e.tsal(350000, 2);
			
		}
		

	}


