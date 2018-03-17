package MapsEx;

import java.util.*;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <Integer,String> tm =new TreeMap<Integer,String>();
		tm.put(101, "Hello");
		tm.put(102, "World");
		System.out.println (tm.values());
	
		for(Map.Entry<Integer, String> m:tm.entrySet()){
			System.out.println(m.getKey()+"   "+ m.getValue());
			
		}
		System.out.println(tm.containsKey(105));
		System.out.println(tm.firstEntry());
		System.out.println(tm.get(101));

	}

}
