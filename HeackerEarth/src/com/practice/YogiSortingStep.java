package com.practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class YogiSortingStep {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long noElemnt = Long.parseLong(br.readLine());
       // System.out.println("I am printing 1" + noElemnt);
		Scanner in = new Scanner(System.in);
		long arr[] = new long[ new Long(noElemnt).intValue()];
        //long i = 0;
        String input[] = br.readLine().split(" ");
       // System.out.println("printing " + input);
		for ( int k = 0; k < input.length; k ++ )
			System.out.println("printing " + input[k]);
        for (int i = 0; i < input.length; i++) {			
			arr[i] = Long.parseLong(input[ i]);
		}
		
		long ascDeg = 0, descDeg = 0;
		
		for ( int j = 0; j < noElemnt - 1; j ++) {
			System.out.println("I am here " + arr[j] + " " + arr[j +1 ] );
			if ( arr[j] < arr[j+1] ) 
				descDeg ++;
			if ( arr[j] > arr[j+1] ) 
				ascDeg ++;
		 System.out.println("Assending value " + ascDeg + " Descending value " + descDeg);
			
		}
		if ( ascDeg < descDeg )
			System.out.println(ascDeg);
		else
			System.out.println(descDeg);
		
		

	}

}
