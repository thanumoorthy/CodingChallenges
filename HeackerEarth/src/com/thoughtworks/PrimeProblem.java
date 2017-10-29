package com.thoughtworks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeProblem {

	static boolean validatePrime(int num) {

		if (num == 1)
			return false;
		else {
			int i, m = 0, flag = 0;
			m = num / 2;
			for (i = 2; i <= m; i++) {
				if (num % i == 0) {
					flag = 1;
					return false;
				}
			}
			if (flag == 0)
				return true;

		}

		return false;
	}

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int points[] = new int[N];
		String pointarray[] = br.readLine().split(" ");
		for (int i = 0; i < pointarray.length; i++) {
			points[i] = Integer.parseInt(pointarray[i]);
		}

		long totPoints = 0;
		long curr_sum = 0;
		int tot_Problem = N;
		int startProblem = 1;

		while (N != 0) {

			while (!validatePrime(N) && N != 0)
				N--;

			if (N == 0)
				break;

			curr_sum = 0;

			for (int i = 1; i <= N; i++) {
				curr_sum = curr_sum + points[startProblem - 1];
				startProblem++;
			}
			if (curr_sum > totPoints)
				totPoints = curr_sum;

			
			tot_Problem = tot_Problem - N;
			N = tot_Problem;

		}

		System.out.println(totPoints);

	}

}
