package com.honeywell;

import java.util.Scanner;

public class ThanuCrazy {

	
	public static void main (String arg[]) {
		
		Scanner in =  new Scanner(System.in);
		int maxLevel = in.nextInt();
		int test  = in.nextInt();
		
		for ( int j =0; j < test ; j ++ ) {
			
			int  startLevel = in.nextInt();
			int  first  = in.nextInt();
			int  second = in.nextInt();

			
			int startValue =  (int) fact(  Math.pow( 2 ,  (maxLevel - startLevel) ) );
			
			
			
			int firstValue =    fact( ( startValue + ( 2 * (first -1 ) ) ) / fact(  startValue + (( 2*first) -1) -2  ));
			int secondValue =    fact( ( startValue + ( 2 * (second -1 ) ) ) / fact(  startValue + ( 2* (second -1) -2)  ));

			
			System.out.println(firstValue + secondValue );
			
			
		}
		
	
		
		 
		
	}
	
	public   static  int fact(double d) {
		
		int result = 1;
		for ( int j =1 ; j < d ; j ++) {
			result = j * result;
		}
		return result;
		
		
	} 
	
	
	
	
}
