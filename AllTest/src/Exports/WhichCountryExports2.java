package Exports;
import java.util.*;

import edu.duke.*;
import org.apache.commons.csv.*;
public class WhichCountryExports2 {
	public void listExports(CSVParser parser, String exportOfInterst) {
        for(CSVRecord record : parser){
            String export = record.get("Exports");
            if(export.contains(exportOfInterst)) {
                String country = record.get("Country");
                System.out.println(country);
            }
        }
    }
    public void whoExportCoffee() {
    	Scanner scanf = new Scanner(System.in);
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        String name;
        name = scanf.nextLine();
        listExports(parser , name);
    }
    
    public static void main(String[] args){
    	
    	WhichCountryExports object = new WhichCountryExports();
    	object.whoExportCoffee();
    }
}
