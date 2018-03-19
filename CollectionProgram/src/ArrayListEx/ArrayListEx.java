package ArrayListEx;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList <String> al=new ArrayList<String>();
		al.add("Rahul");
		al.add("klo");
		//al.add("lop");
		al.add(2, "String");
		int size =al.size();
		System.out.println(size);
		Iterator itr =al.iterator();
		while(itr.hasNext()){
			System.out.println (itr.next());
		}
		for (String a : al){
			
			System.out.println (a);
		}
ArrayList<Integer> al1=new ArrayList<Integer>();
al1.add(12);
al1.add(32);
for (Integer a : al1){
	
	System.out.println (a);
}
ArrayList<String> al11=new ArrayList<String>();
al11.add("12");
al11.add("32");
for (String a : al11){
	
	System.out.println (a);
}
 al.addAll(2,al11);
 for (String all : al){
		System.out.println("welcome");
		System.out.println (all);
		System.out.println("Commit");
	 //lo
	}

	}

}
