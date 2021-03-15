package com.class8;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		for(int i=1; i<4; i++) {//outer loop controls inner loops
			for (int j=1; j<5; j++) {//inner loop
				System.out.println("Hello");
			}
		System.out.println("-------------------------------------------");	
		}
		
		System.out.println("----------------------------------------------------------");
		
		for(int i=1; i<3; i++) {
			
			for(int j=1; j<=4; j++) {
				System.out.println(i+" "+j);
			}
		}
		
		System.out.println("----------------Car odometr---------------------");
		for(int k=0; k<10; k++) {
			for(int o=0; o<=9; o++) {
				for(int g=0; g<=9; g++) {
					for(int y=0; y<=9; y++) {
						System.out.println(k+" "+o+" "+g+" "+y);
					}
				}
			}
		}
		System.out.println("----------------------------------------------------------");
		for(int h=0; h<13; h++) {
			
			for(int m=0; m<60; m++) {
				
				if(h<10 && m<10) {
					
					System.out.println("0"+h+":0"+m);
					
				}else if( h<10 && m>=10){
					
					System.out.println("0"+h+":"+m);
					
				}else if(h>=10 && m<10) {
					
					System.out.println(h+":0"+m);
					
				}else {
					
					System.out.println(h+":"+m);
				}
			}
		}
		
		System.out.println("--------------------------------------------------");
		
		for(int h1=0; h1<13; h1++) {
			for (int m1=0; m1<60; m1++) {
				
				if(h1 < 10) {
					
					if(m1<10) {
						System.out.println("0"+h1+":0"+m1);
						
					}else {
						System.out.println("0"+h1+":"+m1);
					}
				}else {
					
					if(m1<10) {
						System.out.println(h1+":0"+m1);
					}else {
						System.out.println(h1+":"+m1);
					}
				}
			}
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------------");
		int mult;
		for(int r=1; r<10; r++) {
			for(int t=1; t<10; t++) {
				mult=r*t;
				System.out.println(r+" * "+t+" = "+mult);
			}
		}
	}

}
