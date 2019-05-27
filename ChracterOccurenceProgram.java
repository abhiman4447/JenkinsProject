package testProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ChracterOccurenceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		countOccurence("i am abhiman");
		System.out.println(countOccurenceofStringWithRecursion("abhiman", 'a', 0));
		
	}
	//asia
	public static void countOccurence(String str) {
		Map<Character, Integer> mapOccurence = new HashMap<>();
		char[] elements =  str.toCharArray();
		for(int i = 0; i < elements.length; i++) {
		   int counter = 1;
		   for(int j = 0; j < elements.length; j++) {
			   if(elements[i] == elements[j]) {
				   mapOccurence.put(elements[i], counter++);
			   }
		   }
		}
		
		mapOccurence.forEach((Character c, Integer i) -> {
			System.out.println("char :" + c +", count :"+i);
		});
		
	}
	
	public static int countOccurenceofStringWithRecursion(String str, char ch, int index) {
		if(index >= str.length())
			return 0;
		
		int count = str.charAt(index) == ch ? 1 : 0;
		return count + countOccurenceofStringWithRecursion(str, ch, index + 1);
	}

}
