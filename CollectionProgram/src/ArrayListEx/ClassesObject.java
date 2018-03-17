package ArrayListEx;
import com.google.gson.*;
import java.lang.*;
import java.util.*;

import com.google.gson.Gson;

 class a {
	 int rollno;
	 String name;
a(int rollno, String name){
	this.name=name;
	this.rollno=rollno;
}
	
	
	
}

public class ClassesObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a a1=new a(14,"Ram");
		a a2=new a(15,"Mohan");
		ArrayList <a> al= new ArrayList<a>();
		al.add(a1);
		al.add(a2);
		Iterator itr =al.iterator();
		while (itr.hasNext()){
			a ch =(a) itr.next();
			System.out.println (ch.name+" "+ch.rollno);
		}
		for (Object o :al){
			
			System.out.println();
		}
		
		Gson json=new Gson();
		String sa=json.toJson(al);
System.out.println(sa);		
           
		
		
	}
	

}
