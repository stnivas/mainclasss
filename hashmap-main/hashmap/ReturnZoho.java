import java.util.Scanner;
import java.util.HashMap;
public class ReturnZoho{
  Scanner input=new Scanner(System.in);
  
  public void returnValue(){

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
            
            for(int run=0; run<count; run++){
            System.out.println("enter the key to find the value ");
            String  yourKey=input.next();
            // map.getOrDefault(yourKey,"ZOHO");
            System.out.println("Default value="+ map.getOrDefault(yourKey,"ZOHO"));
            }
            
            System.out.println("after hashMap="+map);
            System.out.println("before hashMap="+map.size());
            }
            public static void main(String[] args){
               ReturnZoho obj=new ReturnZoho();
               obj.returnValue();
               }
               }
