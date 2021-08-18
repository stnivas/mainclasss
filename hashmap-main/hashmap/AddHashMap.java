import java.util. HashMap;

public  class AddHashMap{
    
	public void mapAdd(){
	 HashMap<String,String> map=new HashMap<String, String>();
	   map.put("student id", "ID123");
	   map.put("student name", "raj");
	   map.put("student address", "chennai");
	   
	  
	 System.out.println("HashMap="+map);
	 int len=map.size();
	 System.out.println("size of map="+len);
    }
     public static void main(String []args){
	 
	 AddHashMap obj=new  AddHashMap();
	    obj.mapAdd();
	  }
	  }
	