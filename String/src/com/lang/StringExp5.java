package com.lang;

public class StringExp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="java is a java and programming of java";
		String searchText="java";
		int i=text.lastIndexOf(searchText);
		System.out.println(i);
		String checkAvail= (i >= 0)?"The search data "+searchText+" is available into index "+i+ " of the string" : " the string";
		System.out.println(checkAvail);
		int start=0;
		int end=0;
		int count;
		String word[]=text.split(" ");
		System.out.println(word.length);
		for(String temp:word) {
		System.out.println(temp);
		}
	 StringBuffer sb=new StringBuffer("react");//StringBuffer is mutable or changable  
	 //
	 sb.append("angular");
	 /*sb.append("ang");
	 sb.append("angular");
	 sb.append("angular");
	 sb.append("angular");
	 sb.append("angular");
	 sb.append("ang");
	 sb.append("angular");
	 sb.append("angular");*/
	 
	 System.out.println(sb);
	 System.out.println(sb.length());
	 System.out.println(sb.capacity());
	
	}

}
