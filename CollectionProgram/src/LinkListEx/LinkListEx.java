package LinkListEx;

import java.util.*;

public class LinkListEx {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> ll= new LinkedList<String>();
		ll.add("Hello");
		ll.add("World");
		String s=ll.getFirst();
		System.out.println(s);
		System.out.println("ArrayList:" +ll);
		for (String sq :ll){
			System.out.println(sq);
			//System.out.println ( indexOf(new "Hello" ));
		}

	}

}
