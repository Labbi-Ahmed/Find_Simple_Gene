package Gene_Find;
import java.util.*;

import edu.duke.*;
public class Part3 {

	public boolean twoOccurrences(String stringa , String stringb){
		
		int index = stringb.indexOf(stringa);
		if(index != -1)
			if(stringb.indexOf(stringa , index) != -1)
				return true ;
				
		return false;
	}
	public void testing(){
		boolean flag;
		String string_1,string_2;
		string_2 = "abcdefgabcdefg";
		string_1 = "bcd";
		flag =  twoOccurrences(string_1,string_2);
		System.out.println(string_1);
		System.out.println(string_2);
		if(flag)
			System.out.println("True");
		else
			System.out.println("False");
		string_2 = "abcdefgabcdefg";
		string_1 = "bcdk";
		flag =  twoOccurrences(string_1,string_2);
		System.out.println(string_1);
		System.out.println(string_2);
		if(flag)
			System.out.println("true");
		else
			System.out.println("false");
		String string = lastPart(string_1,string_2);
		System.out.println("The part of the string after "+ string_1 + " in " + string_2 + " is " + string);
		string_1 = "bcd";
		string = lastPart(string_1,string_2);
		System.out.println("The part of the string after "+ string_1 + " in " + string_2 + " is " + string);
	}
	private String lastPart(String stringa, String stringb) {

		int indx = stringb.indexOf(stringa);
		if(indx != -1)
			return stringb.substring(indx+stringa.length(), stringb.length());
		
		return stringb;
	}
	
	public static void main(String[] args){
		Part3 object = new Part3();
		object.testing();
	}
}
