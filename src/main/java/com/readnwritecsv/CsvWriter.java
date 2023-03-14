package com.readnwritecsv;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class CsvWriter {
	public int distinctPlayCountOne = 0;
	public int distinctPlayCountTwo = 0;
	public int distinctPlayCountThree = 0;
	public int clientCountOne = 0;
	public int clientCountTwo = 0;
	public int clientCountThree = 0;
	
	public void writerCsv() {
		
		// default all fields are enclosed in double quotes
        // default separator is a comma
		//Creates a new CSVWriter object which will write data to the file "output-data.csv" 
		//It uses FileWriter to create a new file or overwrite the existing file
        try (CSVWriter writer = new CSVWriter(new FileWriter("C://Users//ekilabd//OneDrive - Ericsson//Documents//GitHub//Java-ReadnWritecsv//output-data.csv"))) {
        	String[] header = {"client_count", "distinct_play_count"};
        	writer.writeNext(header);
        	
        	String[] row = {String.valueOf(clientCountOne), String.valueOf(distinctPlayCountOne)};
        	writer.writeNext(row);

        	String[] row2 = {String.valueOf(clientCountTwo), String.valueOf(distinctPlayCountTwo)};
        	writer.writeNext(row2);
        	
        	String[] row3 = {String.valueOf(clientCountThree), String.valueOf(distinctPlayCountThree)};
        	writer.writeNext(row3);
        	
        }
        
        //If it occurs during the writing of the CSV file and prints the stack trace to the console
        catch (IOException e) {
            e.printStackTrace();
        }
	}

}