package com.amazon;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
 
public class MicroMiniCorrect {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));
		
		int T = Integer.parseInt(br.readLine());
 
		while(T>0){
			String str= br.readLine();
			int[] arr = new int[str.length()];
			new MicroMiniCorrect().lps(str, arr);
			
			int result = arr[str.length()-1];
			
			if(result>0 && result%(str.length()-result)==0){
				pw.println(str.length()-result);
			}
			else
				pw.println(str.length());
			
			T--;
		}
		
		
		br.close();
		pw.flush();
		pw.close();
		
	}
	
	private void lps(String pattern,int[] arr){
		int length=pattern.length();
		int j=0,i=0;
		arr[i]=0;
		
		i++;
		
		while(i <length){
			if(pattern.charAt(i) == pattern.charAt(j)){
				j++;
				arr[i]=j;
				i++;
			}
			else
			{
				if(j!=0){		
					j = arr[j-1];
				}
				else
				{
					arr[i]=j;
					i++;
				}
			}
		}		
	}
 
}