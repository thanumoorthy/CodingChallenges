package com.amazon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
 
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
 
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
 
        	long a =0;
		long b =0;
		long c =0;
		long mod = 1000000007;
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
			String line = br.readLine();
			int length = line.length();
			for(int i=0; i<length; i++){
				if(line.charAt(i)=='a')
					a = (1 + 2*a)%mod;
				if(line.charAt(i)=='b')
					b = (a + 2*b)%mod;
				if(line.charAt(i)=='c')
					c = (b + 2*c)%mod;
			}
			System.out.println(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}