package chapter1;

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
	 * Takes in a string and replaces all occurences of spaces
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
	
}
