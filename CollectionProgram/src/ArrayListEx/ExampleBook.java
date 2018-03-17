package ArrayListEx;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
	int bookid;
	String bookname;
	String author;
	Book (int bookid, String bookname, String author){
		this.author=author;
		this.bookid=bookid;
		this.bookname=bookname;
	}
}

public class ExampleBook {

	public static void main(String[] args) {
		String sug="yes";
		ArrayList<Book> al =new ArrayList<Book>();
	do{	System.out.println ("what do you want 1 for add 2 for retrive");
		Scanner sc=new Scanner(System.in);  
		int choose =sc.nextInt();
		
		switch(choose){
		
		case 1: 
			 System.out.println("Enter Book name");
	         String bookname=sc.next();
	         System.out.println("Enter id");
		     int bookid=sc.nextInt();  
		     System.out.println("Enter Book Author");
		     String author=sc.next();
		     Book b=new Book(bookid,bookname,author);
		    al.add(b);
		    System.out.println("YourEntery is done");
		    System.out.println();
		    System.out.println ("do you want more type yes");
		   // Scanner sc=new Scanner(System.in);  
		    sug=sc.next();
		         break;
		case 2: 
			
			 for(Book bq:al){  
	        System.out.println(bq.bookid+" "+bq.bookname+" "+bq.author+" "); 
	        
	    } 
			 System.out.println ("do you want more type yes");
		        sug=sc.next();break;	 	
		
	 }	} while (sug.equals("yes"));
	System.out.println ("thank you");
	
	}

}
