package com.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GreatKianSum {

	public static void main(String arg[]) throws NumberFormatException,
			IOException {

		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int inputArr[] = new int[size];
		String inputStr[] = new String[size];		
		inputStr = br.readLine().split(" "); 
		
		for ( int i = 0 ; i < size; i ++) 
			inputArr[i] = Integer.parseInt(inputStr[i]);
		
		long sum1 = 0, sum2 = 0, sum3 = 0;

		for (int j = 0; j < size; j += 3) {
			sum1 += (long) inputArr[j];
			if (j + 1 < size)
				sum2 += (long) inputArr[j + 1];
			if (j + 2 < size)
				sum3 += (long) inputArr[j + 2];
		}
		System.out.println(sum1 + " " + sum2 + " " + sum3);

	}

}
