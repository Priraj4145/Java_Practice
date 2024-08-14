package com.lang;
class A{
	//int i=10;
	String name;
	A(String name){
		this.name=name;
	}
	@Override
	public String toString() { //without calling the toString() method it is called....
		return "Name : "+this.name;
	}
}

public class StringExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Java string");
		A obj = new A(" a string ");
		System.out.println(s1);
		System.out.println(obj);
		

	}

}
