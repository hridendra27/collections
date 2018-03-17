package MapsEx;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		
         HashMap <Integer,String> hm= new HashMap<Integer,String>();
         hm.put(101, "Hello");
         hm.put(102, "World");
         hm.put(103,"Hridendra");
         hm.put(104, "vishal");
         for (Map.Entry<Integer,String> m:hm.entrySet()){
        	 System.out.println(m.getKey()+"   "+ m.getValue()); 
         } 
         hm.remove(102); 
         //using iterator
         Set set=hm.entrySet();
         Iterator i=set.iterator();
         while (i.hasNext()){
         Map.Entry me=(Map.Entry) i.next();
         System.out.println(me.getKey() +"   "+ me.getValue());	
         
        		 
        }
          ArrayList <String> al =new ArrayList<String>(hm.values());
          for (String s:al){
        	 System.out.println(s);
          }
          Set <Integer> s= new TreeSet<Integer>(hm.keySet());
          for (Integer s1:s){
         	 System.out.println(s1);
           }
        //  Set <String>s2=new TreeSet<String>(hm.entrySet())
        	 
	}
}



