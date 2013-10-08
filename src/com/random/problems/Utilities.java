package com.random.problems;

import java.util.Arrays;


public final class Utilities {
	
	public static int computeEditDistance(String str1, String str2) {
		
		if(str1 == null || str2 == null)
			throw new IllegalArgumentException();
		
		int a = str1.length(), b = str2.length();
		
		if(a == 0 || b == 0)
			return Math.max(a,b);
		
//		int[][] memory = new int[a][b];
		
		return computeEditDistance(str1, str2, a-1, b-1);
		
//		for(int i = 0; i<a;i++) 
//			System.out.println(Arrays.toString(memory[i]));
//		
//		return memory[a-1][b-1];
	}
	
	private static int computeEditDistance(String str1, String str2, int a, int b) {
		
		if( a == 0 && b == 0) {
			if(str1.charAt(a) == str2.charAt(b))
				return 0;
			else
				return 1;
		}
		
		int x = Integer.MAX_VALUE, y = x, z = x;
		
		if(a>0) {
			x = computeEditDistance(str1, str2, a-1, b);
		}
		if(b>0) {
			y = computeEditDistance(str1, str2, a, b-1);
		}
		if(a>0 && b>0) {
			z = computeEditDistance(str1, str2, a-1, b-1);
		}
		
	
		int delta = (str1.charAt(a) == str2.charAt(b)) ? 0 : 1;
		
		return Math.min(z, Math.min(y, x)) + delta;
	}
	
	@Deprecated
	private static void computeEditDistance(String str1, String str2, int a, int b, int[][] memory) {

		if( a == 0 && b == 0) {
			if(str1.charAt(a) == str2.charAt(b))
				memory[a][b] = 0;
			else
				memory[a][b] = 1;
			return;
		}
		
		int x = Integer.MAX_VALUE, y = x, z = x;
		
		if(a>0) {
			computeEditDistance(str1, str2, a-1, b, memory);
			x = memory[a-1][b];
		}
		if(b>0) {
			computeEditDistance(str1, str2, a, b-1, memory);
			y = memory[a][b-1];
		}
		if(a>0 && b>0) {
			computeEditDistance(str1, str2, a-1, b-1, memory);
			z = memory[a-1][b-1];
		}
		
	
		int delta = (str1.charAt(a) == str2.charAt(b)) ? 0 : 1;
		
		memory[a][b] = Math.min(z, Math.min(y, x)) + delta;
		
	}
	
	public static int lcs(String str1, String str2) {
		if(str1 == null || str2 == null || str1.length() == 0 || str2.length()==0)
			return 0;
		
		int m = str1.length(), n = str2.length();
		
		int[][] mem = new int[m][n];
		int maxLen = 0, maxI = 0, maxJ = 0;
		
		for(int i=0;i<m;i++) {
			
			char x = str1.charAt(i);
			
			for(int j=0;j<n;j++) {
				
				int p = (i>0) ? i-1 : i;
				int q = (j>0) ? j-1 : j;
			
				if(x == str2.charAt(j)) { 
					
					mem[i][j] = mem[p][q] + 1;
					
					if(maxLen < mem[i][j]) {
						maxLen = mem[i][j];
						maxI = i;
						maxJ = j;
					}
					
				} else {
					mem[i][j] = 0;
				}
					
			}
		}
		
//		System.out.println("Index in 1st string: " + maxI + " str1: " + str1 + "\nIndex in 2nd String: " + maxJ + " str2: " + str2);
		return maxLen;
	}

}
