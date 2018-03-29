package chapter1;

/**
 * There are three types of edits that can be ferfromed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are one edit(or zero edits) away.
 *
 * @author Momeni
 *
 */
public class OneAway {

	// THOUGHTS: Okay, so one would be able to grab one of the strings,
	// create all the permutations and then check if the other supplied
	// strings matches any of the variations created. (that would solve the problem)
	// but it would be a dumb approach.
	
	// A second approach would be to initially check the length of both strings
	// if the string length is the same we can assume that it could only be a replacement
	// if a string is shorter or longer it could only be shorter or longer by one character only.
	/**
	 * Checks if two strings are one or zero edits away from being the same
	 * @param s1
	 * @param s2
	 * @return
	 */
	public boolean isOneAway(String s1, String s2){
		
		if(s1.toLowerCase().equals(s2.toLowerCase())){
			return true;
		}
		
		// check if the strings are the same length if so we only deal with comparisons and 
		// replacements
		
		// if s1 is shorter than s2 we know something needs be inserted into s1 somewhere
		// if s1 is longer than s2 we know something needs to be deleted from s1 somewhere
		
		
		
		return false;
	}
}
