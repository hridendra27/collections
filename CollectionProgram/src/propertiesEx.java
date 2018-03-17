
	import java.util.*;  
	import java.io.*;  
public class propertiesEx {

  
   
    public static void main(String[] args)throws Exception{  
      
    Properties p=new Properties();  
    p.setProperty("name","Hridendra");  
    p.setProperty("email","hridendra.srivastava@gingerwebs.co.in");  
      
    p.store(new FileWriter("info.properties"),"Example");  
      
    }  
      }