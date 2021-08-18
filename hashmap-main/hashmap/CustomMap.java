import java.util. HashMap;
import java.util.Scanner;

   
public  class CustomMap{
Scanner input=new Scanner(System.in);
    
	public void checkValue(){
	
	 HashMap<String,String> map=new HashMap<String,String>();
	 for(int i=0; i<3; i++){
	 System.out.println("1.enter the key");
	 String name=input.next();
	 System.out.println("2.enter address  ");
	 String address=input.next();
	   map.put(name,address);
	   }
	   
