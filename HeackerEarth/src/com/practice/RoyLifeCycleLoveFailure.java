package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RoyLifeCycleLoveFailure {
	public static void main(String arg[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tot_days = Integer.parseInt(br.readLine());
		String life[] = new String[tot_days];
		// int maxCoding[] = new int[tot_days];

		for (int i = 0; i < tot_days; i++)
			life[i] = br.readLine();

		int j, k;
		boolean pre_status;
		boolean pre_streak_status = false;
		int count = 0;
		int maxCount;
		int strLenght;
		int maxStreakDays = Integer.MIN_VALUE;
		int maxCoding = 0;
		int streakDays=0;
		int last_coding_count;
		last_coding_count = 0;
		boolean coding_finish = true;
		for (j = 0; j < tot_days; j++) {

			pre_status = false;
			maxCount = Integer.MIN_VALUE;
			

			strLenght = life[j].length();
			
			for (k = 0; k < strLenght; k++) {

				if (j >= 1 && pre_streak_status && life[j].charAt(k) == 'C') {
					//System.out.println("Printing last coding count  " + last_coding_count);
					if (last_coding_count > 0 && coding_finish) {
						streakDays = streakDays + 1 + last_coding_count;						
						last_coding_count = 0;
						coding_finish = false;
						//System.out.println("1.Printing Streak Days " + streakDays);
					} else {
						streakDays =  streakDays + 1;
						//System.out.println("Printing Streak Days " + streakDays);
					}
				}
				if (maxStreakDays < streakDays)
					maxStreakDays = streakDays;

				if (life[j].charAt(k) == 'C') {
					if (!pre_status)
						count = 0;
					count++;
					if (count > maxCount)
						maxCount = count;

					pre_status = true;

				} else {
					pre_status = false;
					pre_streak_status = false;
					coding_finish = true;
					streakDays = 0;
				}

				if (k == strLenght - 1 && pre_status) {
					pre_streak_status = true;
				    last_coding_count = count;
				    
				   // System.out.println("last coding count " + last_coding_count);
				}   
				    
            
			}

			if (maxCount > 0) {
				if (maxCoding < maxCount)
					maxCoding = maxCount;

			}
			 System.out.println( j +  " th iteration current streakDays " + streakDays + " maxStreakDays  "+ maxStreakDays +"last coding count " + last_coding_count);
		}
		if (maxStreakDays< maxCoding )
			  maxStreakDays = maxCoding;

		System.out.println(maxCoding + " " + maxStreakDays);

	}
}
