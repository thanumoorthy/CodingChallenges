package com.makemytrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProblem {

	public static void main(String arg[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String pattern = br.readLine();

		String patternList[] = pattern.split(" ");
		char x = patternList[0].charAt(0);
		char y = patternList[1].charAt(0);
		int x_count = 0;
		int y_count = 0;
		int tot_substring = 0;

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == x && y_count == 0) {
				x_count++;

			} else if (input.charAt(i) == x && y_count > 0) {
				x_count++;
				tot_substring += y_count;
			} else if (input.charAt(i) == y && x_count == 0) {
				y_count++;
			} else if (input.charAt(i) == y && x_count > 0) {
				y_count++;
				tot_substring += x_count;
			}

		}

		System.out.println("Total Sub String is " + tot_substring);

	}

}
