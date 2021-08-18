import java.util. HashMap;
import java.util.Scanner;

public  class AddNumber{
Scanner input=new Scanner(System.in);
    
	public void addInteger(){
	 HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	 for(int i=0; i<3; i++){
	 System.out.println("enter s.no.number");
	 Integer number=input.nextInt();
	 System.out.println("enter the phone number ");
	 Integer phoneNumber=input.nextInt();
	   map.put(number,phoneNumber);
	   }
	   
	  
	 System.out.println("HashMap="+map);
	 int len=map.size();
	 System.out.println("size of map="+len);
    }
	
     public static void main(String []args){
	 
	 AddNumber obj=new  AddNumber();
	    obj.addInteger();
	  }
	  }
	