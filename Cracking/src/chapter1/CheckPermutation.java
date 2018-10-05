package chapter1;

import java.util.HashMap;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 * @author Momeni
 *
 */
public class CheckPermutation {

	
	/**
	 * Checks if s1 and s2 are permutations of each other (case sensitive)
	 * @param s1
	 * @param s2
	 * @return true/false
	 */
	public boolean isPermutation(String s1, String s2){
		
		if(s1.length() != s2.length()){
			return false;
		}
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : s1.toCharArray()){
			if(map.containsKey(c)){
				map.put(c, (map.get(c)+1));
			} else {
				map.put(c, 1);
			}
		}
		
		for(char c : s2.toCharArray()){
			if(!map.containsKey(c)){
				return false;
			} else {
				map.put(c, (map.get(c)-1));
			}
		}
		
		for(int i : map.values()){
			if(i != 0){
				return false;
			}
		}
		
		return true;
	}
}
