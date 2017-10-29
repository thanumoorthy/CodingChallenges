package com.nuvizz;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeOfPrime {

	static boolean checkPrime(long k) {

		if (k == 1)
			return false;
		else {
			long i, m = 0, flag = 0;
			m = k / 2;
			for (i = 2; i <= m; i++) {
				if (k % i == 0) {
					flag = 1;
					return false;
				}
			}
			if (flag == 0)
				return true;

		}

		return false;
	}

	public static void main(String arg[]) throws Exception {

		long tot_test;
		long start, end;
		String line;
		String split[] = new String[2];
		long i;
		long j;
		long num_prime = 0;
		long tot_prime = 0;
		boolean check = false;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		tot_test = Long.parseLong((br.readLine()));

		for (i = 0; i < tot_test; i++) {

			line = (String) br.readLine();
			split = line.split(" ");
			start = Long.parseLong(split[0]);
			end = Long.parseLong(split[1]);

			num_prime = 0;
			tot_prime = 0;

			for (j = start; j <= end; j++) {

				if (j == start) {

					for (long k = 2; k <= j; k++) {
						if (checkPrime(k))
							num_prime++;

					}
					if (checkPrime(num_prime))
						tot_prime++;
				}

				else {

					if (checkPrime(j))
						num_prime++;
					if (checkPrime(num_prime))
						tot_prime++;
				}

			}
			System.out.println(tot_prime);
		}

		// System.out.println("value is " +tot_test + " " + start + " " + end);

	}

}
