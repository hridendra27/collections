package HashSetEx;

import java.util.*;

public class HashSetEx {

	
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();  
		hs.add("Ram");
		hs.add("Shayam");
		hs.add("kol");
		hs.add("gopal");
		hs.add("kol");
		Iterator <String> i=hs.iterator();
		while (i.hasNext()){
			System.out.println(i.next());
		}
		
		
	}

}
