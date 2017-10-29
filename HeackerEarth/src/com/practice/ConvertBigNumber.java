package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConvertBigNumber {

	public static void main(String arg[]) throws Exception {

		String input[] = new String[2];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		input = br.readLine().split(" ");

		int k = Integer.parseInt(input[1]);
		StringBuilder in = new StringBuilder(input[0]);

		for (int i = 0; i < k; i++) {
			if (i < in.length()) {
				if (9 != ((int) in.charAt(i) - 48)) {
					in.setCharAt(i, '9');
				} else {
					k += 1;
				}
			}
			else {
				break;
			}

		}
		System.out.println(String.valueOf(in));

	}

}
