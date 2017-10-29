package com.nuvizz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LifeCycle {

	public static void main(String arg[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tot_days = Integer.parseInt(br.readLine());
		String life[] = new String[tot_days];
		int maxCoding[] = new int[tot_days];

		for (int i = 0; i < tot_days; i++)
			life[i] = br.readLine();

		int j, k;
		boolean pre_status;
		int count = 0;
		int maxCount;
		for (j = 0; j < tot_days; j++) {

			pre_status = false;
			maxCount = Integer.MIN_VALUE;
			for (k = 0; k < life[j].length(); k++) {

				if (life[j].charAt(k) == 'C') {
					if (!pre_status)
						count = 0;
					count++;
					if (count > maxCount)
						maxCount = count;

					pre_status = true;

				} else {
					pre_status = false;
				}

			}

			maxCoding[j] = maxCount;
			// System.out.println("Maxcoding time " + maxCoding[j]);
		}

		int maxCodingDays = Integer.MIN_VALUE;
		int longestCodingStreak = 0;
		for (int i = 0; i < tot_days; i++) {
			if (maxCoding[i] > maxCodingDays)
				maxCodingDays = maxCoding[i];

			/*if ( tot_days > 1) {
			if (longestCodingStreak < maxCoding[i])
				longestCodingStreak += maxCoding[i];
			}*/	

		}
		
		for (int i = 0; i < tot_days; i++) {
			
			if ( longestCodingStreak < maxCodingDays)
				longestCodingStreak += maxCoding[i];
			
	    }
		

		System.out.println(maxCodingDays + " " + longestCodingStreak);

	}

}
