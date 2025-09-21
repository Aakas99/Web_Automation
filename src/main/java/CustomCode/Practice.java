package CustomCode;

import java.util.HashMap;

public class Practice {
	public static void main(String[] args){
		String a = "34test909gda@sdet!23pro";
	      char[] b = a.toCharArray();
	      int left =0;
	      int right = b.length-1;
	      
	      while(left<right) {
	    	  if(!Character.isLetter(b[left])) {
	    		  left++;
	    	  }
	    	  else if(!Character.isLetter(b[right])) {
	    		  right--;
	    	  }
	    	  else {
	    		  char temp = b[left];
		    	  b[left]= b[right];
		    	  b[right]= temp;
		    	  left++;
		    	  right--;
	    	  }
	    	  
	    	  
	    	  
	    	  
	      }
	      String result = new String(b);
	      System.out.println(result);
	      
	           
	          
	       }
	}

	       
	       
	       
	       
	        
	    

