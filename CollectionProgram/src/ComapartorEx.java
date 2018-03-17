import java.util.Comparator;
import java.util.TreeSet;


public class ComapartorEx {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
 TreeSet <Student> tm  =new TreeSet <Student>(new NameComp());
 tm.add(new Student (10,"Hridendra3"));
 tm.add(new Student (14,"Hridendra5"));
 tm.add(new Student (12,"Hridendra4"));
 tm.add(new Student (17,"Hridendra2"));
 tm.add(new Student (1,"Hridendra1"));
 for (Student a:tm){
	 System.out.println(a);
	 
 }
System.out.println("=====++++++++======");
 
 TreeSet <Student> tm1  =new TreeSet <Student>(new RollNoComp());
 tm1.add(new Student (10,"Hridendra3"));
 tm1.add(new Student (14,"Hridendra5"));
 tm1.add(new Student (12,"Hridendra4"));
 tm1.add(new Student (17,"Hridendra2"));
 tm1.add(new Student (1,"Hridendra1"));
 for (Student a:tm){
	 System.out.println(a);
	 
 }
	}
	

}
class NameComp implements  Comparator <Student>{
	public int compare (Student s1, Student s2)
	{
		return s1.getName().compareTo(s2.getName());
	}
}
class RollNoComp implements Comparator <Student>{
	public int compare (Student s1, Student s2){
		if (s1.getRollno()>s2.getRollno()){
			return 1;
		}else return -1;
	}
}
class Student{
	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Student (int rollno, String name){
		this.name = name;
        this.rollno=rollno;
	}
	public String toString(){
	  return "Name: "+this.name+"-- rollNo: "+this.rollno;
		
	}
	
}
