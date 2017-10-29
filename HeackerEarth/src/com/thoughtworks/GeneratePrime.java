package com.thoughtworks;

public class GeneratePrime {

	
	
	static boolean checkPrime(int num) {

		if (num == 1)
			return true;
		else {
			int i, m = 0, flag = 0;
			m = num / 2;
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					flag = 1;
					return false;
				}
			}
			if (flag == 0)
				return true;

		}

		return false;
	}
	
	
	public static void main (String arg[]) {
		
		
		for (int  i =1 ; i <=100 ; i ++){
			
			if ( checkPrime ( i) )
			   System.out.print(i + " ");
			
			
			
		}
		System.out.println();
		
		
	}
	
	
	
	
}
