package MapsEx;
import java.util.*;
public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable <Integer,String> ht =new Hashtable  <Integer,String>();
		ht.put(102,"Hello");
		ht.put(105,"World");
		for (Map.Entry<Integer,String> m:ht.entrySet()){
			System.out.println(m.getKey()+"  "+ m.getValue());
		}
		

	}

}
