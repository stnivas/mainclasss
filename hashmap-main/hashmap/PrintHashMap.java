
import java.util.*;

public class PrintHashMap{
  Scanner input=new Scanner(System.in);
  
  public void printHashMap(){

        String key="";
        String value="";
        HashMap<String,String> map=new HashMap<String,String>();
        
        System.out.println("enter the number of key and values");
        int count= input.nextInt();
        
	    for(int run=0; run<count; run++){
        	System.out.println("enter the  key");
        	key=input.next();
        	System.out.println("enter the value");
                 value=input.next();
             	map.put(key, value);
            }
         
            for(Map.Entry entry: map) {
            	 
        System.out.println(entry.getKey() + " " + entry.getValue());
            
            }
            }
      public static void main(String[] args){
      PrintHashMap obj=new PrintHashMap();
      obj.printHashMap();
      }
}
