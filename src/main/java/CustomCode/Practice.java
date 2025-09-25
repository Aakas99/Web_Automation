package CustomCode;

import java.util.ArrayList;

import java.util.List;


public class Practice {
	
	public static void main(String[] args){
		 String a = "BOBERRE";
	        String longestPalindrome = ""; // Variable to store the longest palindrome found
	        List<String> allPalindromes = new ArrayList<>(); // To store all found palindromes
	        
	        // --- 1. Robust Palindrome Detection ---
	        // 'i' is the starting index, 'j' is the ending index (non-inclusive for substring)
	        for(int i = 0; i < a.length(); i++) {
	            // Start j from i to include single-character substrings
	            for(int j = i + 1; j <= a.length(); j++) { 
	                
	                String substring = a.substring(i, j);
	                
	                // Check if the substring is a palindrome
	                StringBuilder reversed = new StringBuilder(substring).reverse();
	                
	                if(substring.equals(reversed.toString())) {
	                    // System.out.println("Added: " + substring); // Debugging line
	                    allPalindromes.add(substring);
	                }
	            }
	        }
	        
	        //System.out.println("--- Found Palindromes ---");
	        // For BOBERRE, this list includes: B, O, B, E, R, R, E, RR, BOB
	        
	        // --- 2. Correctly Find the Longest Palindrome ---
	        for(String p : allPalindromes) {
	            // Compare the length of the current palindrome (p) with the current longest one
	            if(p.length() > longestPalindrome.length()) {
	                longestPalindrome = p; // Update the longest palindrome
	            }
	        }
	        
	        //System.out.println("--- Longest Palindrome ---");
	        System.out.println(longestPalindrome);
	     
	      
	           
	          
	       }
	}

	       
	       
	       
	       
	        
	    

