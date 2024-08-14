package com.lang;

public class StringExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="java python java angular hello java";
int len=s1.length();
System.out.println(len);
System.out.println(s1.charAt(2));
for(int index=0;index<len;index++) {
	
}
System.out.println(s1.indexOf("python",15));
System.out.println(s1.lastIndexOf("java"));
System.out.println(s1.substring(s1.indexOf("java")+2, s1.lastIndexOf("java")));
	}

}
//substring
//System.out.println(s1.subString(10,20));
//System.out.println(s1.lastIndex("java"));
