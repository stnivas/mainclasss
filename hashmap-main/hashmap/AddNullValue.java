import java.util. HashMap;
import java.util.Scanner;

public  class AddNullValue{
Scanner input=new Scanner(System.in);
    
	public void nullValue(){
	
	 HashMap<String,String> map=new HashMap<String,String>();
	 for(int i=0; i<3; i++){
	 System.out.println("1.enter the name");
	 String name=input.next();
	 System.out.println("2.enter address with one null ");
	 String address=input.next();
	   map.put(name,address);
	   }
	   
	  
	 System.out.println("HashMap="+map);
	 int len=map.size();
	 System.out.println("size of map="+len);
    }
	
     public static void main(String []args){
	  AddNullValue obj=new  AddNullValue();
	  obj.nullValue();
	  }
	  }
	