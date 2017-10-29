package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class AgeOfEmpire {

	public static void main(String arg[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noTest = Integer.parseInt(br.readLine());
		int totSol = 0;
		String strArr[] = null;
		Integer bobArr[] = null;
		Integer aliceArr[] = null;
		String result;
		for (int i = 0; i < noTest; i++) {
			totSol = Integer.parseInt(br.readLine());
			bobArr = new Integer[totSol];
			aliceArr = new Integer[totSol];
			result = "";

			strArr = br.readLine().split(" ");
			for (int j = 0; j < totSol; j++)
				bobArr[j] = Integer.parseInt(strArr[j]);

			strArr = br.readLine().split(" ");
			for (int j = 0; j < totSol; j++)
				aliceArr[j] = Integer.parseInt(strArr[j]);

			Arrays.sort(bobArr, Collections.reverseOrder());
			Arrays.sort(aliceArr, Collections.reverseOrder());

			
			 for (int j = 0; j < totSol; j++) System.out.print(bobArr[j]
			 +" "); System.out.println();
			 
			 for (int j = 0; j < totSol; j++) System.out.print(aliceArr[j]
			  +" "); System.out.println();
			 

			Boolean greater = false;
			String heavyStrenght = "";
			int bobCount = 0, aliceCount = 0, tieCount = 0;
			int j;

			System.out.println("Bob " + bobArr[0]);
			System.out.println("Alice " + aliceArr[0]);
			if ((bobArr[0].equals(aliceArr[0]))) {
				System.out.println("I am here");
				heavyStrenght = "Tie";
			}

			else {
				for (j = 0; j < totSol; j++) {

					if (bobArr[j] == aliceArr[j]) {
						tieCount++;

					}

					else if (bobArr[j] > aliceArr[j]) {
						bobCount++;
						if (!greater) {
							heavyStrenght = "Bob";
							greater = true;
						}

						// break;
					} else if (bobArr[j] < aliceArr[j]) {
						aliceCount++;
						if (!greater) {
							heavyStrenght = "Alice";
							greater = true;
						}
						// break;

					}

				}
			}

			System.out.println("BobCount AliceCount " + bobCount + " " + aliceCount);
			System.out.println("Bob Maximum Alice Maximum" + bobArr[0] + " " + aliceArr[0] );
			if (heavyStrenght!= "Tie" && bobCount == aliceCount )
				System.out.println("Tie");
			else			
			    System.out.println(heavyStrenght);

		}

	}

}
