import java.util.Scanner;
import java.util.HashMap;
public class TwoHashMap{
  Scanner input=new Scanner(System.in);
  
  public void  createTwoMap(){

        String key="";
        String value="";
        HashMap<String,String> map=new HashMap<String,String>();
        HashMap<String,String> mapTwo=new HashMap<String,String>();
        System.out.println("enter the number of key and values");
        int count= input.nextInt();
        
	    for(int run=0; run<count; run++){
        	System.out.println("enter the  key");
        	key=input.next();
        	System.out.println("enter the value");
                 value=input.next();
             	map.put(key, value);
            }
         
            System.out.println("before map");
            System.out.println("before map size"+map.size());
            
            mapTwo.putAll(map);
            System.out.println("after mapTwo");
            System.out.println("after map size"+map.size());
            }
            public static void main (String[] args){
            TwoHashMap obj=new TwoHashMap();
            obj.createTwoMap();
            }
}
