
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
    
    public void testSimpleGene(){
        String DNA , sub_string; 
        DNA = "TAGCTATTCTGCCGAATC"; // gene sequence without ATG and TAA
        System.out.println("DNA strand is " + DNA);
        sub_string = findSimpleGene(DNA);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }
        
        DNA = "TCGTAGGCATAATGCCGA"; // gene sequence without ATG
        System.out.println("DNA strand is " + DNA);
        sub_string = findSimpleGene(DNA);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }
        
        DNA = "TACATGTCCAGGTGGGTCTGC";                         // gene sequence with ATG and without TAA
        System.out.println("DNA strand is " + DNA);
        sub_string = findSimpleGene(DNA);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }
        
        DNA = "TACATGTCCAGGTGGGTCTGCTAA";                     /// gene sequence with ATG , TAA and sub_string is multiple of 3   
        System.out.println("DNA strand is " + DNA);
        sub_string = findSimpleGene(DNA);
        if(sub_string.length() != 0){
             System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }
        
        DNA = "TACATGTCCAGGTGGGTCTTGCTAA";                 // gene sequence sub_string is not multiple of 3
        System.out.println("DNA strand is " + DNA);
        sub_string = findSimpleGene(DNA);
        if(sub_string.length() != 0){
             System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is : Invalid sequence");
        }
   
    }
}
