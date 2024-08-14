package day2;

import java.io.*;
import java.util.*;

public class taskone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int English=sc.nextInt();
		int Tamil=sc.nextInt();
		int Maths=sc.nextInt();
		int Science=sc.nextInt();
		int Social=sc.nextInt();
		
		/* if(English<=100 && Tamil<=100 && Maths<=100 && Science<=100 && Social<=100) {
			 System.out.println();
			 }
			 else {
					System.out.println("Invalid input");
				}*/
		if(English>=40 && Tamil>=40 && Maths>=40 && Science>=40 && Social>=40 ) {
			System.out.println("Congradulation you got passed in this examination");
		}else {
			System.out.println("sorry,Better Luck next time.");
		}
		int Totalmark=English+Tamil+Maths+Science+Social;
		System.out.println("Totalmark:"+ Totalmark);
		if(Totalmark>450) {
			System.out.println("A grade");
		}
		else if(Totalmark>400) {
			System.out.println("B grade");
		}
		else if(Totalmark>350) {
			System.out.println("C grade");
		}
		else if(Totalmark>300) {
			System.out.println("D grade");
		}
		else {
			System.out.println("you are failed");
		}
    	
		 if(English<=100 && Tamil<=100 && Maths<=100 && Science<=100 && Social<=100) {
			 System.out.println();
			 }
			 else {
					System.out.println("Invalid input");
				}
		 }
	 
		
		
	}

