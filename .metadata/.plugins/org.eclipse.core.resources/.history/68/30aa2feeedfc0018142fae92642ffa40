package chapter1;
import java.util.*;

/**
 * Assume you have a method isSubstring which checks if one word is a substring of another.
 * Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one 
 * call to isSubstring
 * @author Momeni
 *
 */
public class StringRotation {

	public boolean stringRotation(String s1, String s2){
		
		if(s1.length() != s2.length()){
			return false;
		}
		
		if(s1.equals(s2)){
			return true;
		}
		
		LinkedList<String> list = new LinkedList<String>();
		
		for(int i = 1; i < s1.length(); i++){
			list.add(s1.substring(i) + s1.substring(0, i));
		}
	
		
		for(String s : list){
			System.out.println(s);
			if(s.equals(s2)){
				return true;
			}
		}
		return false;
		
	}
}
