import java.util. HashMap;
import java.util.Scanner;

public  class KeyExists{
Scanner input=new Scanner(System.in);
    
	public void check(){
	
	 HashMap<String,String> map=new HashMap<String,String>();
	 for(int i=0; i<3; i++){
	 System.out.println("1.enter the key");
	 String name=input.next();
	 System.out.println("2.enter name ");
	 String address=input.next();
	   map.put(name,address);
	   }
	   
	  
	 System.out.println("HashMap="+map);
	 int len=map.size();
	 System.out.println("size of map="+len);
	 boolean keyExist=map.containsKey("nivas");
	   
	 System.out.println("1 IS EXIST:" +keyExist);
	 
	 keyExist=map.containsKey(10);
	   System.out.println("10 IS EXIST:" +keyExist);
    }
	
	
	
     public static void main(String []args){
	   KeyExists obj=new KeyExists();
	  obj.check();
	  }
	  }
	
