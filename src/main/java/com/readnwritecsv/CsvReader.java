package com.readnwritecsv;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

public class CsvReader {
	
	//Store the data from the CSV file as a list of string arrays
	public static List<String[]> r;
	
	//That reads the data from a CSV file
	public void readerCsv() throws IOException, CsvException {

        String fileName = "C://Users//ekilabd//OneDrive - Ericsson//Documents//GitHub//Java-ReadnWritecsv//input-data.csv";
        CSVParser csvParser = new CSVParserBuilder().withSeparator(';').build(); // custom separator
        
        //Creates an instance of CSVReader and reads all the data from the CSV file using the readAll() method
        
        try(CSVReader reader = new CSVReaderBuilder(
                new FileReader(fileName))
                .withCSVParser(csvParser)   // custom CSV parser
                .withSkipLines(1)           // skip the first line, header info
                .build()){
        	
        	//The data read from the file is stored in the r variable as a list of string arrays
            r = reader.readAll();
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
	}
}