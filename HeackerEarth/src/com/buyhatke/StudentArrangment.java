package com.buyhatke;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class StudentArrangment {

	public static void main(String arg[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String inputArr[] = input.split(" ");
		int noStud = Integer.parseInt(inputArr[0]);
		int noRow = Integer.parseInt(inputArr[1]);
		int maxEachRow = Integer.parseInt(inputArr[2]);
		input = br.readLine();
		inputArr = input.split(" ");
		int studPref[] = new int[noStud];

		for (int i = 0; i < noStud; i++) {
			studPref[i] = Integer.parseInt(inputArr[i]);
		}

		int res = 0;
		long totalCap = noRow * maxEachRow;

		Map<Integer, Integer> seatArr = new HashMap<Integer, Integer>();
		for (int j = 1; j <= noRow; j++) {
			seatArr.put(j, 0);
		}

		int rowStatus;
		int prefRow;
		for (int i = 0; i < noStud; i++) {
			if (i + 1 > totalCap)
				res++;
			else {

				prefRow = studPref[i];
				rowStatus = seatArr.get(prefRow);
				if (rowStatus >= maxEachRow) {
					res++;

					do {
						prefRow = (prefRow + 1);
						if (prefRow > noRow)
							prefRow = 1;
						rowStatus = seatArr.get(prefRow);

					} while (rowStatus >= maxEachRow);

					seatArr.put(prefRow, rowStatus + 1);
				}

				seatArr.put(prefRow, rowStatus + 1);

			}
		}

		/*for ( int i =1; i <=noRow; i ++)
			System.out.print(seatArr.get(i) + " ");
		System.out.println();*/
		System.out.println(res);

	}

}
