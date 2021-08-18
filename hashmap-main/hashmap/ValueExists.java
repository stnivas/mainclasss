import java.util. HashMap;
import java.util.Scanner;

   
public  class ValueExists{
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
	   
	  
	 System.out.println("HashMap="+map);
	 int len=map.size();
	 System.out.println("size of map="+len);
	 System.out.println("check value");
	 
	 String check=input.next();
	 boolean valueExist=map.containsValue(check);
	   
	 System.out.println( +valueExist);
	 
	 valueExist=map.containsValue(check);
	   System.out.println( +valueExist);
    }
	
     public static void main(String []nivas){
	    ValueExists obj=new ValueExists();
	   obj.checkValue();
	  }
	  }
	
