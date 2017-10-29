package com.amazon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class MicroandMini {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noTest = Integer.parseInt(br.readLine());
		String input, tmp;
		int count;
		for (int i = 0; i < noTest; i++) {
			input = br.readLine();
			Set<String> distinctSet = new HashSet<String>();
			count = 0;
			for (int j = input.length() - 1; j >= 0; j--) {

				tmp = input.substring(j) + input.substring(0, j);
				distinctSet.add(tmp);

				// System.out.println("j value is " + j + " " +tmp);

			}
			System.out.println(distinctSet.size());

		}

	}

}
