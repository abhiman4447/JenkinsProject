package testProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Map<Employee, Integer> empMap = new HashMap<>();
//		Employee e1 = new Employee(123, "abhiman", 12345);
//		Employee e2 = new Employee(126, "anirban", 345556);
//		Employee e3 = new Employee(129, "sanket", 445556);
//		Employee e4 = new Employee(129, "sanket", 122222);
//		Employee e5 = new Employee(129, "sanket", 335556);
//		
//		System.out.println(e3.hashCode());
//		
//		long h = 160;
//		long a =  h >>> 16;
//		System.out.println(160 ^ a);
//		
//		System.out.println(15 & 160);
//		
//		empMap.put(e1, 12345);
//		empMap.put(e2, 34345);
//		empMap.put(e3, 44345);
//		empMap.put(e4, 55345);
//		empMap.put(e5, 44345);
//		
//		System.out.println(e1.hashCode());
//		empMap.forEach((Employee e, Integer i) -> {
//			System.out.println("Emp : "+ e+", salary : "+i);
//		});
		
		Map<String,Integer> map = new HashMap<>();
	    map.put("Arpan",33);
	    map.put("Nishant",22);
	    map.put("Abhiman",28);
	    
	    
	    TreeMap<String, Integer> tMap = new TreeMap<String, Integer>(
	    	 new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					return o2.compareTo(o1);
				}
	    		 
	    	 }
	    	);
	    
	    
	    LinkedList<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(map.entrySet()); 
	    
	    Collections.sort(list, 
	    	 new Comparator<Entry<String, Integer>>(){

				@Override
				public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
					// TODO Auto-generated method stub
					return o2.getKey().compareTo(o1.getKey());
				}
	    	
	    });	
	    		
	    
	    Map<String, Integer> sMap = new LinkedHashMap<String, Integer>();
	    
	    for(Entry<String, Integer> entry : list) {
	      sMap.put(entry.getKey(), entry.getValue());
	    }
	    
	    
	    
	    tMap.forEach((s, i) -> {
	    	  System.out.println(s);
	    });
	    
	    
	    
        LinkedList<Entry<String, Integer>> lList =  new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
        
        Collections.sort(lList, 
        		new Comparator<Entry<String, Integer>>(){

					@Override
					public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
						// TODO Auto-generated method stub
						return o2.getValue().compareTo(o1.getValue());
					}
        	   
        }
        );
        
        
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
//        for(Entry<String, Integer> entry1 : lList) {
//        	  sortedMap.put(entry.getKey(), entry.getValue());
//        }
        
        
        sortedMap.forEach((s, i) -> {
	    	  System.out.println(i);
	    });
	    
	    
        //new ArrayList<Map.Entry<String, Integer>>(tMap.entrySet()));
	    
	}
	
	

}

class Employee{
	
	private int id;
	private String name;
	private int salary;
	
	
	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
