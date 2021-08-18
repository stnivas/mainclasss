import java.util. HashMap;

public  class EmptyHashMap{
    
	public void map(){
	 HashMap<Integer,String> map=new HashMap<Integer, String>();
	 
	 System.out.println("HashMap="+map);
	 int len=map.size();
	 System.out.println("size of map="+len);
    }
     public static void main(String []args){
	 
	  EmptyHashMap obj=new  EmptyHashMap();
	  obj.map();
	  }
	  }
	