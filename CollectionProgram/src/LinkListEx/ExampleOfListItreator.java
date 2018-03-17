package LinkListEx;

import java.util.*;

public class ExampleOfListItreator {

public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<String>();
		al.add("Hello");
		al.add("World");//al.add("jsckle");
		ListIterator <String> li =al.listIterator();
		while (li.hasNext()){
			System.out.println (li.next());
			}
			while (li.hasPrevious()){
				System.out.println(li.previous());
			}
		}
	}


