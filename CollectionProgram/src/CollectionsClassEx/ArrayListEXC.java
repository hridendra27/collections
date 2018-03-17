package CollectionsClassEx;

import java.util.*;

public class ArrayListEXC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(12);
		al.add(1);
		al.add(122);
		al.add(127);
		al.add(102);
		al.add(2);
		al.add(23);
		Collections.addAll(al,15,18,19,20);
		for (Integer a:al){
			System.out.println(a);
		}
		Collections.sort(al);
		
		System.out.println("Afetr Sorting");
		for (Integer a:al){
			System.out.println(a);
		}
		System.out.println("Size Of Array list:"+al.size());
		System.out.println("max Of Array list:"+ Collections.max(al));
		System.out.println("min Of Array list:"+Collections.min(al));
          Collections.reverse(al);
          for (Integer a:al){
  			System.out.println(a);
  		}

	}

}
