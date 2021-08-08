package com.strings.learnings;

import java.util.*;

public class Reverse_Strings {

	public Reverse_Strings() {
		// TODO Auto-generated constructor stub
	}
	  
		 public static String reverse(String in){
		 //    if (in==null)
		   //  throw new IllegalArgumentException("Please provide a string instead of null values"); 
		     
		     StringBuilder output = new StringBuilder();
		     
		     char[] chars = in.toCharArray();
		     
		     System.out.println(chars.length);
		     
		     for (int i=chars.length-1;i>=0;i--)
		     {
		    	 output.append(chars[i]);
		    	// System.out.println(chars[i]);
		     }
		     return output.toString();
		 }
		 
		    public static void main(String[] args){
		        
		        String str = "123456";
				System.out.println(reverse(str));
		        
		    }
		    
		}

