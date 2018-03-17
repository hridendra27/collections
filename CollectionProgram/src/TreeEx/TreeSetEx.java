package TreeEx;

import java.util.*;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		  TreeSet<String> ts =new TreeSet<String>();  
		  ts.add("Ram");
		  ts.add("Foly");
		  ts.add("djosnhon");
		  ts.add("Ram");
		  Iterator <String> i=ts.iterator();
		  while (i.hasNext()){
			  System.out.println(i.next());
		  }
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ram1");
		al.add("ram2");
		al.add("Ram3");
		TreeSet <String> tp=new TreeSet<String>(al);
		System.out.println (tp);
	}

}
