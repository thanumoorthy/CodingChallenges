package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MinMax {

	public static void main(String arg[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int inputArr[] = new int[size];
		String inputStr[] = new String[size];
		inputStr = br.readLine().split(" ");

		for (int i = 0; i < size; i++)
			inputArr[i] = Integer.parseInt(inputStr[i]);

		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		Map<Integer, Boolean> inputMap = new HashMap<Integer, Boolean>();

		for (int i = 0; i < size; i++) {

			if (inputArr[i] < minValue)
				minValue = inputArr[i];
			else if (inputArr[i] > maxValue)
				maxValue = inputArr[i];

			inputMap.put(inputArr[i], true);

		}

		Boolean status = true;
		;
		for (int j = minValue + 1; j < maxValue; j++) {
			if (inputMap.containsKey(j)) {
				continue;
			} else {
				status = false;
				break;
			}

		}

		if (status)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}
