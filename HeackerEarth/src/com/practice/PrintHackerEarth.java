package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PrintHackerEarth {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String inputStr = br.readLine();
		String pattern = "hackerearth";
		int charCount[] = new int[26];
		Map<Character, Integer> pattMap = new HashMap<Character, Integer>();
		for (int i = 0; i < pattern.length(); i++) {
			pattMap.put(pattern.charAt(i), 0);
		}

		for (int i = 0; i < inputStr.length(); i++) {
			if (pattMap.containsKey(inputStr.charAt(i))) {
				charCount[inputStr.charAt(i) - 'a']++;
			}

		}

		int maxCount = (size / 11) + 1;
		Boolean pass = true;
		int totCount = 0;
		for (int j = 0; j < maxCount; j++) {

			for (int i = 0; i < pattern.length(); i++) {
				if (charCount[pattern.charAt(i) - 'a'] > 0) {
					charCount[pattern.charAt(i) - 'a'] --;
					continue;
					
				} else {
					pass = false;
					break;

				}
			}

			if (pass)
				totCount += 1;

			else
				break;

		}

		System.out.println(totCount);

	}

}
