package com.class8;

import java.util.Scanner;

public class Whileeee {

	public static void main(String[] args) {
		
		Scanner input;
		int num=3;
		
		input=new Scanner(System.in);
	
		
		do {
			System.out.println("Please pay for a soda");
			num=input.nextInt();
			
			if (num<3) {
				System.out.println("Please pay more");
			}else if(num>3) {
				System.out.println("Please pay less");
			}
		}while (num!=3);
		   System.out.println("Thank you");
		   
		   
		   
		   System.out.println("--------------------------------------------------------------------------");
		   
		   System.out.println("Please pay for soda");
		   num=input.nextInt();
		   
		   while(num!=3) {
			   if(num<3) {
				   System.out.println("Please pay more");
			   }else if (num>3) {
				   System.out.println("Please pay less");
			   
			   }
			   num=input.nextInt();
		   }
				   System.out.println("Thank you");
		   }
			
		}


