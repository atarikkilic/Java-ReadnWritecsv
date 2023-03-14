package com.readnwritecsv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.opencsv.exceptions.CsvException;

public class Main {
	
	//Count the number of occurrences of each element in the input ArrayList 
	public static Map<Integer, Integer> countOccurrences(ArrayList<Integer> arr) {
	    Map<Integer, Integer> countMap = new HashMap<>();
	    for (int i = 0; i < arr.size(); i++) {
	        int key = arr.get(i);
	        if (countMap.containsKey(key)) {
	            countMap.put(key, countMap.get(key) + 1);
	        } else {
	            countMap.put(key, 1);
	        }
	    }
	    return countMap;
	}

	public static void main(String[] args) throws IOException, CsvException {
		
		// Creates a new instance of the CsvReader and calls its readerCsv method
		
		CsvReader csvr = new CsvReader();
		csvr.readerCsv();
        
		//Creates a new ArrayList<Integer> called repeatedCustomers
		
        ArrayList<Integer> repeatedCustomers = new ArrayList<Integer>(); 
        
        // Iterates through each array arrays contained in the r field of the CsvReader object
        for (String[] arrays : csvr.r) {
        	
        	//Parse the elements and converts into integers using the parseInt method
        	int parseYear = Integer.parseInt(arrays[3].split("[.]")[2]);
            int parseMonth = Integer.parseInt(arrays[3].split("[.]")[1]);
            int parseDay = Integer.parseInt(arrays[3].split("[.]")[0]);
        	
            int parseCustomer = Integer.parseInt(arrays[2]);
            
            if(parseYear == 2022 && parseMonth == 02 && parseDay == 2) {
            
            	//clientId is added to the repeatedCustomers list
            	repeatedCustomers.add(parseCustomer);

            }
            
            
        }
        
        //A new instance of the CsvWriter class is created and assigned to the csvw variable
        
        CsvWriter csvw = new CsvWriter();
        
        //arr is created, initialized with the contents of the repeatedCustomers list
        //and passed to the countOccurrences method
        
        ArrayList<Integer> arr = new ArrayList<Integer>(repeatedCustomers);
        Map<Integer, Integer> countMap = countOccurrences(arr);
        
        //The count of occurrences of that key is retrieved from the countMap map and assigned to the count variable
        //The count is used to update the appropriate clientCount and distinctPlayCount fields in the CsvWriter object csvw
        
        for (Integer key : countMap.keySet()) {
            int count = countMap.get(key);
            //System.out.println(key + " occurs " + count + " times");
            if(count==1) {
            	csvw.clientCountOne++;
            	csvw.distinctPlayCountOne=count;
            }
            else if(count==2) {
            	csvw.clientCountTwo++;
            	csvw.distinctPlayCountTwo=count;
            
            }
            else {
            	csvw.clientCountThree++;
            	csvw.distinctPlayCountThree=count;
            }
        }
        	//The writerCsv method of the csvw object is called to write the updated values to a CSV file
        	csvw.writerCsv();
	}

}