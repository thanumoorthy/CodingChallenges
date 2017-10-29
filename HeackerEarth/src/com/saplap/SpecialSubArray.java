package com.saplap;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SpecialSubArray {

	public static void main(String arg[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int no_test = Integer.parseInt(line);
		int input_num[];
		int tot_count;
		for (int i = 0; i < no_test; i++) {
			tot_count = 0;
			int tot_num = Integer.parseInt(br.readLine());
			String input[] = br.readLine().split(" ");
			
			//System.out.println("tot_count value is "  + input.length);
			input_num = new int[tot_num];
			tot_count += tot_num;
			//System.out.println("tot_count value is "  + tot_count);
			

			for (int j = 0; j < input.length; j++)
				input_num[j] = Integer.parseInt(input[j]);

			int temp_val = input_num[0];
			boolean included = false;
			int tem_count = 0;
			for (int j = 0; j < tot_num; j++) {

				if (input_num[j] == temp_val) {
					//included = true;
					tem_count++;
				} else {
					//included = false;
					temp_val = input_num[j];
					if (tem_count > 0) {
						tot_count += 1;
						tem_count = 0;
					}

				}

			}

		System.out.println( tot_count);
		
		}
		
		
		
		
		

	}

}
