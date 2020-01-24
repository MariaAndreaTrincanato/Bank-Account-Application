package utilities;

import java.util.List;
import java.util.LinkedList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CSV {
	
	//This method will read a CSV file and return as a list
	//each element in the list will be an array
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			while((dataRow = br.readLine()) != null) {
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}
			
		} catch(FileNotFoundException e){
			System.out.println("COULD NOT FIND THE FILE");
			e.printStackTrace();
			
		} catch(IOException e){
			System.out.println("COULD NOT READ THE FILE");
			e.printStackTrace();
		}
		
		return data;
	}
}
