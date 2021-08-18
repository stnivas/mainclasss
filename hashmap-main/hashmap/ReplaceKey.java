import java.util.Scanner;
import java.util.HashMap;
public class ReplaceKey{
  Scanner input=new Scanner(System.in);
  
  public void replace(){

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
            
         
           for(int run=0;run<count; run++){
              System.out.println("enter the key");  
                 key=input.next(); 
              System.out.println("enter the replace values");
              String  name= input.next();
              System.out.println("replace values is="+map.replace(key,name));
              }
              System.out.println("after map size="+map.size());
              System.out.println("after map ="+map);
              
              }
              public static void main(String[] args){
              ReplaceKey obj=new ReplaceKey();
              obj.replace();
              }
              }
              
              
                 
       
