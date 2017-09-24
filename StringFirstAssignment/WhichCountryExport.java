import edu.duke.*;
import org.apache.commons.csv.*;
 
public class WhichCountryExport
{
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
        FileResource fr = new FileResource();
        CSVParser parser = fr.getCSVParser();
        listExports(parser , "coffee");
    }
}
