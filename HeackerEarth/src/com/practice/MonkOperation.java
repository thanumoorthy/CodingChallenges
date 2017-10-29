package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MonkOperation {

	public static void main(String arg[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noTest = Integer.parseInt(br.readLine());
		String noStr[] = new String[2];
		String arrStr[] = null;
		int noElement, noOps;
		List<Integer> arr = new ArrayList<Integer>();
		long temp1, temp2, temp;
		for (int i = 0; i < noTest; i++) {

			noStr = br.readLine().split(" ");
			noElement = Integer.parseInt(noStr[0]);
			noOps = Integer.parseInt(noStr[1]);
			arrStr = br.readLine().split(" ");
			for (int j = 0; j < arrStr.length; j++) {
				arr.add(Integer.parseInt(arrStr[j]));
			}

			for (int k = 1; k <= noOps; k++) {

				if (noElement > 2) {

					temp1 = arr.get(1) * arr.get(noElement - 1);
					temp2 = arr.get(0) * arr.get(noElement - 2);
					// System.out.println("temp1 temp2 " + temp1 + " " + temp2);
					if (temp1 > temp2)
						arr.remove(0);
					else if (temp1 == temp2) {
						if (arr.get(0) < arr.get(noElement - 1))
							arr.remove(0);
						else
							arr.remove(noElement - 1);
					}

					else
						arr.remove(noElement - 1);

					noElement = noElement - 1;
				}

			}

			System.out.println(arr.get(0) * arr.get(noElement - 1));
			arr.clear();
		}

	}

}
