package Gene_Find;
import edu.duke.*;
import java.util.*;
public class FinedGenePart2 {
	
	public String findSimpleGene(String dna , String startCodon , String stopCodon){
		String result = "";
		boolean flag = false; 
		if((int)dna.charAt(0) >= 97){
			dna = dna.toUpperCase();
			flag = true;
			
		}
        int startIndex = dna.indexOf(startCodon);
        if(startIndex == -1){
            return "";
        }
        int stopIndex = dna.indexOf(stopCodon);
        if(stopIndex == -1){
            return "";
        }
        if((stopIndex - startIndex + 3) % 3 == 0){
            result = dna.substring(startIndex , stopIndex+3);
        }
        if(flag)
        	result = result.toLowerCase();
        
        return result;
    }
    
    public void testSimpleGene(){
        String DNA , sub_string; 
        DNA = "TAGCTATTCTGCCGAATC"; // gene sequence without ATG and TAA
        sub_string = findSimpleGene(DNA , "ATG" , "TAA");
        System.out.println("DNA is: " + DNA  + "\n" + "Gene is: " + sub_string);
        
        DNA = "TCGTAGGCATAATGCCGA"; // gene sequence without ATG
        sub_string = findSimpleGene(DNA , "ATG" , "TAA");
        System.out.println("DNA is: " + DNA  + "\n" + "Gene is: " + sub_string);
        
        DNA = "TACATGTCCAGGTGGGTCTGC";                         // gene sequence with ATG and without TAA
        sub_string = findSimpleGene(DNA , "ATG" , "TAA");
        System.out.println("DNA is: " + DNA  + "\n" + "Gene is: " + sub_string);
        
        DNA = "TACATGTCCAGGTGGGTCTGCTAA";                     /// gene sequence with ATG , TAA and sub_string is multiple of 3   
        sub_string = findSimpleGene(DNA , "ATG" , "TAA");
        System.out.println("DNA is: " + DNA  + "\n" + "Gene is: " + sub_string);
        
        DNA = "TACATGTCCAGGTGGGTCTTGCTAA";                 // gene sequence sub_string is not multiple of 3
        sub_string = findSimpleGene(DNA , "ATG" , "TAA");
        System.out.println("DNA is: " + DNA  + "\n" + "Gene is: " + sub_string);
        
        DNA = "atgcttcattaa";
        sub_string = findSimpleGene(DNA , "ATG" , "TAA");
        System.out.println("DNA is: " + DNA  + "\n" + "Gene is: " + sub_string);
        
    }
    public static void main(String arg[]){
    	FinedGenePart2 ob = new FinedGenePart2();
    	ob.testSimpleGene();
    }
}
