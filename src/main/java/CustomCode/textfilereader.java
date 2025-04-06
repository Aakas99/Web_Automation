package CustomCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class textfilereader {
	
	public String textreader(String Key) {
		String filePath = "C:\\Users\\spaak\\OneDrive\\Documents\\JavaWorkspace\\Web_Automation\\Data\\Xpath.txt"; // Replace with your text file path
	     String searchKey = Key; // Replace with the key you want to search for
	     String Value= null;

	     try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	         Map<String, String> dataMap = new HashMap<>();
	         String line;

	         // Read each line and populate the map
	         while ((line = br.readLine()) != null) {
	        	
	             String[] parts = line.split("=",2); // Assuming key-value pairs are separated by '='
	             if (parts.length == 2) {
	            	 
	                 String key = parts[0].trim();
	                 System.out.println(key);
	                 String value = parts[1].trim();
	                 dataMap.put(key, value);
	                 //System.out.println(dataMap.get(searchKey));
	             }
	         }

	         // Retrieve the value based on the key
	         if (dataMap.containsKey(searchKey)) {
	        	 Value = dataMap.get(searchKey);
	             System.out.println("Key: " + searchKey + ", Value: " + dataMap.get(searchKey));
	         } else {
	             System.out.println("Key not found: " + searchKey);
	         }
	         
	     } catch (Exception e) {
	         e.printStackTrace();
	     }
		return Value;
	}
	 
}
