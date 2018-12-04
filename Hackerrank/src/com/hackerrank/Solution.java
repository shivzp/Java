package com.hackerrank;

import java.util.Scanner;

public class Solution {

	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            String s = method(a,b,n);
	            System.out.println(s);
	        }

	        in.close();
	    }

	    public static String method(int a,int b, int n) {
	        int sum = 0;
	        StringBuffer sb = new StringBuffer();
	        for(int j = 0 ;j<n; j++ ) {
	            if ( j ==0 ) {
	            sum = sum + (a + (b *(int)Math.pow(2,j)));
	            } else {
	                  sum = sum +  (b *(int)Math.pow(2,j));

	            }
	            sb.append(sum);
	            sb.append(' ');
	        }
	        return sb.toString();
	    }
	    
	}


