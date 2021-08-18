import java.util. HashMap;
import java.util.Scanner;

public class ValueChange10 {

  Scanner input=new Scanner(System.in);
  
    public  void  change(){
        String number="";
        String value="";
        HashMap<String,String> map=new HashMap<String,String>();
        System.out.println("enter the number of key and values");
        int count= input.nextInt();
        
	    for(int run=0; run<count; run++){
        	System.out.println("enter the  key");
        	number=input.next();
        	System.out.println("enter the value");
                 value=input.next();
             	map.put(number, value);
            }
            
        System.out.println("map"+map);  
        System.out.println("map"+map.size()); 
        System.out.println("you need to change the value click1. not need click2");
           int choice=input.nextInt();
               
         if(choice==1){
        
        System.out.println("number of value change");
        count=input.nextInt();
        
        for(int run=0;run<count; run++){
        System.out.println("enter your key");
        number=input.next();
        System.out.println("enter your value");
        value=input.next();
        map.replace(number, value);
        }
        }
        else if(choice==2){
        System.out.println("your select no changes");
        }
          System.out.println("map"+map); 
    
    } 
    
    
          
          
    public static void main(String[] args){
          ValueChange10 obj=new ValueChange10();
    	  obj.change();
    }
}
