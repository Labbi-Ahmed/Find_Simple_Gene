package Gene_Find;
import edu.duke.*;
import java.util.*;
public class FinedGenePart2 {
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
            System.out.println("Gene is :");
        }
        
        DNA = "TCGTAGGCATAATGCCGA"; // gene sequence without ATG
        System.out.println("DNA strand is " + DNA);
        sub_string = findSimpleGene(DNA);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is :");
        }
        
        DNA = "TACATGTCCAGGTGGGTCTGC";                         // gene sequence with ATG and without TAA
        System.out.println("DNA strand is " + DNA);
        sub_string = findSimpleGene(DNA);
        if(sub_string.length() != 0){
            System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is :");
        }
        
        DNA = "TACATGTCCAGGTGGGTCTGCTAA";                     /// gene sequence with ATG , TAA and sub_string is multiple of 3   
        System.out.println("DNA strand is " + DNA);
        sub_string = findSimpleGene(DNA);
        if(sub_string.length() != 0){
             System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is :");
        }
        
        DNA = "TACATGTCCAGGTGGGTCTTGCTAA";                 // gene sequence sub_string is not multiple of 3
        System.out.println("DNA strand is " + DNA);
        sub_string = findSimpleGene(DNA);
        if(sub_string.length() != 0){
             System.out.println("Gene is : " + sub_string);
        }
        else{
            System.out.println("Gene is :");
        }
   
    }
    public static void main(String arg[]){
    	FinedGenePart2 ob = new FinedGenePart2();
    	ob.testSimpleGene();
    }
}
