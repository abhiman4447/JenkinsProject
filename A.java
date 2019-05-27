package testProject;

import java.util.ArrayList;

public class A {

    public static void main(String[] args) {
    	 
    	  int h = 154;
    	  h = h >>> 2;
    	  System.out.println(154 ^ h);
    	  
    	  
    	  ArrayList<Integer> al = new ArrayList<Integer>();
    	  al.add(3);
    	  al.add(null);
    	  al.add(0, 4);
    	  
    	  System.out.println(al.get(0));
    	  System.out.println("Hello jenkins");
    	  
    }
	
}
