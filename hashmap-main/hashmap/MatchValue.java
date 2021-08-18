import java.util.Scanner;
import java.util.HashMap;
public class MatchValue{
  Scanner input=new Scanner(System.in);
  
  public void match(){

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
            
            System.out.println("before map="+map);
             System.out.println("before map size="+map.size()); 
             
             System.out.println("enter the key");
              key=input.next();
             
              System.out.println("enter the value");
              value=input.next();
              map.remove(key, value);
             System.out.println("after map="+map);
             System.out.println("after map size="+map.size()); 
             }
             public static void main(String[] args){
              MatchValue obj=new MatchValue();
              obj.match();
              }
              }
