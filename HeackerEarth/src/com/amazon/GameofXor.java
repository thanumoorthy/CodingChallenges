package com.amazon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GameofXor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int noTest = Integer.parseInt(br.readLine());
		Scanner in = new Scanner(System.in);
		//in.nextInt();
		int N;
		int arr[];
		int arr1[];
		String input[];
		int xor_arr;
		int xor_subarr;
		for (int i = 0; i < noTest; i++) {
			N = Integer.parseInt(br.readLine());
			input = br.readLine().split(" ");
			arr = new int[N];
			arr1 = new int[N];
			xor_arr = 0;
			xor_subarr = 0;
			for (int k = 0; k < N; k++)
				arr[k] = Integer.parseInt(input[k]);

			arr1[0] = arr[0];
			xor_arr = arr[0];
			int k;
			for (int j = 1; j < N; j++) {
				xor_subarr = arr1[j - 1] ^ arr[j];
				xor_arr = xor_arr ^ xor_subarr;
				//System.out.println("Finding xor  of " + j + " " +  (j-1));
				arr1[j] = xor_subarr;
                k = j;
				while (k > 0) {
					xor_subarr = arr1[k - 1] ^ arr1[j];
					xor_arr = xor_arr ^ xor_subarr;
					//System.out.println("Finding xor   of partial array " + j + " " +  (k-1) );
					k--;
				}

			}

			System.out.println(xor_arr);

		}

	}

}
