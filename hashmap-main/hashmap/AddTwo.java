import java.util. HashMap;
import java.util.Scanner;

public  class AddTwo{
Scanner input=new Scanner(System.in);
    
	public void addTwoType(){
	
	 HashMap<String,Integer> map=new HashMap<String,Integer>();
	 for(int i=0; i<3; i++){
	 System.out.println("enter the name");
	 String name=input.next();
	 System.out.println("enter the phone number ");
	 Integer phoneNumber=input.nextInt();
	   map.put(name,phoneNumber);
	   }
	   
	  
	 System.out.println("HashMap="+map);
	 int len=map.size();
	 System.out.println("size of map="+len);
    }
	
     public static void main(String []args){
	 
	 AddTwo obj=new AddTwo();
	    obj.addTwoType();
	  }
	  }
	