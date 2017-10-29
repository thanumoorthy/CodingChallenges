package com.thoughtworks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCDSequnceCorrect {
	public static int M = (int) (Math.pow(10,7) + 7);
	 
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int[] arr = new int[N];
		String input[] = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(input[i]);
		}
		int res = 0;
		for (int i = 0; i < input.length; i++) {
			res = res +compute(i, N, arr, arr[i], new int[N]);
			res=res%M;
		}
		System.out.println(res);
	}
 
	private static int compute(int i, int n, int[] arr,int gcd, int[] result) {
		int count = gcd==1?1:0;
		for (int j = i+1; j < n; j++) {
			if (arr[i]<arr[j]) {
				count = count + compute(j, n, arr, gcd(gcd, arr[j]), result);
			}
		}
		return count;
	}
 
	private static int gcd(int i, int j) {
		while (j != 0) {
			int t = j;
			j = i % j;
			i = t;
		}
		return i;
	}
}
