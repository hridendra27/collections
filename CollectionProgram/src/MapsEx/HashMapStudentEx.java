package MapsEx;

import java.util.HashMap;
import java.util.Map;

class student{
	int rollno ;
	String Name;
student(int rollno ,String Name){
		this.Name=Name;
		this.rollno=rollno;
	}
}


public class HashMapStudentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map <Integer,student> hm1 = new HashMap <Integer,student>();
		 student s1 =new student (10,"Hridendra");
		 student s2 =new student (11,"Hridendra2");
		 student s3 =new student (12,"Hridendra3");
		 hm1.put(101, s1);
		 hm1.put(102, s2);
		 hm1.put(104, s3);
		 // Traversing
		 for(Map.Entry<Integer,student> entry: hm1.entrySet()){    
		        int key=entry.getKey();  
		        student s=entry.getValue();  
		        System.out.println(key+" Details:");  
		        System.out.println(s.rollno+"  "+ s.Name);   
		    } 

	}

}
