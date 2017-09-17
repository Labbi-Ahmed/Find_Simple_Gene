
/**
 * This class findout the invalid gene sequence from the given DNA
 *
 * @Labbi Ahemd
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.*;
public class FindAGeneSequence
{
    public String findSimpleGene(String dna){
        int startIndex = dna.indexOf("ATG");
        if(startIndex == -1){
            return "";
        }
        int stopIndex = dna.indexOf("TAA");
        if(stopIndex == -1){
            return "";
        }
        if((stopIndex - startIndex + 3) % 3 == 0){
            return dna.substring(startIndex , stopIndex+3);
        }
        return "";
    }
}
