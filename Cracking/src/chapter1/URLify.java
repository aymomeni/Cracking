package chapter1;

import java.lang.Character;

/**
 * Replace all spaces inside a string with a %20
 * 
 * Question to self: What if there is multiple spaces following eacho other
 * e.g. Mr\s\sJohn -> should there be one %20 or multiple?
 * @author Momeni
 *
 */
public class URLify {

	/**
	 * Takes in a string and replaces all occurrences of spaces using a string buffer
	 * with a %20.
	 * @param s
	 * @return
	 */
	public String urlifyString(String s){
		
		StringBuffer sBIn = new StringBuffer(s.trim());
		StringBuffer sBOut = new StringBuffer();
		
		for(char c : sBIn.toString().toCharArray()){
			if(c == ' '){
				sBOut.append("%20");
			} else {
				sBOut.append(c);
			}
		}
		
		return sBOut.toString();
	}
	
	/**
	 * Takes in a string and replaces all occurrences of spaces using char array
	 * with a %20.
	 * @param charArr
	 * @return
	 */
	public char[] urlify(char[] charArr) {
		
		int insertIndex = charArr.length - 1;
		boolean firstCharFound = false; 
		
		for(int runnerIndex = charArr.length-1 ;runnerIndex >= 0; runnerIndex--) {
			
			if(Character.isWhitespace(charArr[runnerIndex]) && !firstCharFound) {
				continue;
			} else if(Character.isWhitespace(charArr[runnerIndex])) {
				charArr[insertIndex] = '0';
				charArr[insertIndex-1] = '2';
				charArr[insertIndex-2] = '%';
				
				insertIndex -= 3;
			} else {
				firstCharFound = true;
				charArr[insertIndex] = charArr[runnerIndex];
				insertIndex--;
			}
		}
		
		return charArr;
	}
	
}
