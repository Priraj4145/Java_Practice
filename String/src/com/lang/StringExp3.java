package com.lang;

public class StringExp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s1="java python";
int strlength=s1.length();

System.out.println(strlength);
//System.out.println(s1.charAt(1));
int count =0;
for(int index=0;index<strlength;index++) {
	System.out.println("string of char " +index+" : " +s1.charAt(index));



for(int j=index+1;j<=strlength;j++) {
	
	if(s1.charAt(index)==s1.charAt(j)) {
	count++;
	//System.out.println("count "+count);
}}
	System.out.println(count);
}
}

	}


