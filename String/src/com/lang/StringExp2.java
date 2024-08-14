package com.lang;


public class StringExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    String str1=new String("java");
    String str2=new String("java");
    
    String s1="java";
    String s2="java";
   //s1=s1.concat(" python");
    //System.out.println(s1);
    
   //str1=str.concat(" react");
    System.out.println(s1==s2);
    System.out.println(str1==str2);
    s1=s1.concat(" python");
    str1=str1.concat(" react");
    System.out.println(s1);
    System.out.println(str1);
    System.out.println("done");
	}

}
