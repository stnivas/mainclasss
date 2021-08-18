import java.util.Scanner;
import java.util.HashMap;
public class RemoveKey{
  Scanner input=new Scanner(System.in);
  
  public void remove(){

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
             	map.put(key,value);
            }
            
            System.out.println("before map"+ map);
            System.out.println("before map size"+ map.size());
       
           String rmv= map.remove(key);
           System.out.println("remove key="+rmv); 
            System.out.println("after map="+map); 
            System.out.println("after size="+map.size()); 
            }
            
            public static void main (String[] args){
              RemoveKey obj=new RemoveKey();
              obj.remove();
              }
              }
