import java.util.Scanner;
import java.util.HashMap;
public class FindValueWithOutKey{
  Scanner input=new Scanner(System.in);
  
  public void getValues(){

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
            
            for(int run=0; run<count; run++){
            System.out.println("enter the key to find the value ");
            String  yourKey=input.next();
           boolean right=map.containsKey(yourKey);
          //  map.get(yourKey);
          System.out.println(right);
            System.out.println("get value="+map.get(yourKey));
            }
            
            System.out.println("hashMap="+map);
            System.out.println("hashMap="+map.size());
            }
            public static void main(String[] args){
               FindValueWithOutKey obj=new FindValueWithOutKey();
               obj.getValues();
               }
               }
