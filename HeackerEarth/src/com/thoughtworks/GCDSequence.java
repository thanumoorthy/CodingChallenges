package com.thoughtworks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class GCDSequence {

	static int calgcd(int a, int b) {
		if (a == 0)
			return b;
		return calgcd(b % a, a);
	}

	public static void main(String arg[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int score[] = new int[N];
		String markarray[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			score[i] = Integer.parseInt(markarray[i]);
		}


		int k;
		
		Arrays.sort(score);
		
		long count = 1;
		
		if ( score[0] == 1) {
			count +=  (long) ( Math.pow(2, N-1) -1);
			//System.out.println(count);
		    count = (long) (count % ( Math.pow( 10,9) + 7));		
		}			
		   
	   int j =1;
	   while ( j +1 <  N ){
		   
		  if (  Math.abs(score[j] - score[j +1 ]) == 1 ) {
			  count +=  (long) ( Math.pow(2, N-2) -1);
			  count = (long) (count % ( Math.pow( 10,9) + 7));
		  }
		      
		  j ++; 
	   }
		
	   System.out.println(count);
		
		
		
		
		/*long tot_combination = (long) Math.pow(2, N);	
		
		tot_combination = (long) (tot_combination % ( Math.pow( 10,9) + 7));
		

		
		long count = 0;

		int pre_value;
		int gcd_value;
	

		for (j = 1; j < tot_combination; j++) {
			//ct ++;
			if ((j & (j - 1)) == 0 && j != 1)
				continue;

			pre_value = gcd_value = 0;

			for (k = 0; k < N; k++) {

				if ((j & 1 << k) > 0) {

					if (score[k] == 1) {

						count++;
						break;
					}
					if (pre_value == 0)
						pre_value = score[k];
					else {

						gcd_value = calgcd(pre_value, score[k]);
						if (gcd_value == 1) {
							count++;
							break;
						}

					}

				}
			}

		}
		
		count = (long) (count % ( Math.pow( 10,9) + 7));

		System.out.println(count);
	//	System.out.println(ct);
*/
	}

}
