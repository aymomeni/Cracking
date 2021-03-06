package chapter1;

import java.util.HashMap;

/**
 * Implement a method to perform basic string compression using
 * the counts of repeated characters. E.g. the string aabcccccaaa would become
 * a2b1c5a3 if the compressed string would not become smaller than the original string your method
 * should return the original string. You can assume the string has only uppercase and lower case 
 * letters (a-z)
 * @author Momeni
 *
 */
public class StringCompression {

	// my very convoluted solution of this problem
	public String stringCompress(String s){
		
		StringBuilder sB = new StringBuilder();
		char[] inputCharArr = s.toCharArray();
		
		for(int i = 0; i < inputCharArr.length; i++) {
			char prev = inputCharArr[i];
			int count = 1;
			
			for(int j = i + 1; j < inputCharArr.length; j++){
				
				if(prev == inputCharArr[j]) {
					count++;
					
					if(j + 1 == inputCharArr.length) {
						i = j-1;
						sB.append(prev);
						sB.append(count);
						break;
					}
					
				}  else {
					i = j-1;
					sB.append(prev);
					sB.append(count);
					break;
				}
			}
			
		}
				
		return sB.toString().length() > s.length() ? s : sB.toString();
	}
	
}
