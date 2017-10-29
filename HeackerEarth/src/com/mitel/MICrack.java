package com.mitel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MICrack {

	static long tot_num;
	static long tot_query;
	static long modulo;

	public static void main(String arg[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner in = new Scanner(System.in);
		String line = (String) br.readLine();
		
		String split[] = line.split(" ");
		tot_num = Long.parseLong(split[0]);
		tot_query = Long.parseLong(split[1]);
		modulo = Long.parseLong(split[2]);
		long arr[] = new long[(int) tot_num];
		long prodVal = 1;
        
		
		
		/*line = (String) br.readLine();
		split = line.split(" ");
		for (int i = 0; i < tot_num; i++) {
			arr[i] = Long.parseLong(split[i]);
			prodVal *= arr[i];
		}
		*/
		
		for ( int i = 0; i < tot_num; i ++){
			arr[i] =  Long.parseLong(in.next());
			prodVal *= arr[i];
		}
		
		
		
		
		long query;
		for (int j = 0; j < tot_query; j++) {
			query = Long.parseLong(br.readLine());
			System.out.println((prodVal / arr[(int) (query-1)]) % modulo);

		}

		// System.out.println("product vlaue is " + prodVal);

	}

}
