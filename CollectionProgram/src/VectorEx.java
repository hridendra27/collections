import java.util.*;


public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <String> v=new Vector<String>();
        v.addElement("Digpal");
       boolean b= v.add("yes");
       System.out.println(b);
       //traversing elements using Enumeration  	
	Enumeration e=v.elements();
	while (e.hasMoreElements()){
		System.out.println(e.nextElement());
	}
	
	}

}
