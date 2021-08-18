
import java.util.*;

public class RemoveEntry{
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
            
            System.out.println("before size"+map.size());
            System.out.println("before map"+map);
            map.clear();
            System.out.println("after size"+map.size());
            System.out.println("before map"+map);
            
            }
           public static void main(String[] args){
           RemoveEntry obj=new RemoveEntry();
           obj.printHashMap();
          }
          }
