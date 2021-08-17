
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.*;

public class ArrayListTask extends ArrayList<Long>{
	static Scanner input=new Scanner(System.in);

	public void createArrayList(){
	//Question1
	  ArrayList<String> list= new ArrayList<String>();
	  
	  System.out.println("arraylistSize="+list.size());
	  System.out.println("arraylist="+list);
	}
	public int  addFiveString(String names[]){
	 //Question2
		ArrayList<String> listTwo= new ArrayList<String>();
		for(int run=0;run<names.length;run++){
		listTwo.add(names[run]);
		}
	      System.out.println("arraylist="+listTwo);
	      return  listTwo.size();
	}
	public int  addFiveIntegers(int number[]){
	//Question3
		ArrayList<Integer>listThird=new ArrayList<Integer>();
		for(int run=0;run<number.length ;run++){
		listThird.add(number[run]);
		}	
	    System.out.println("arraylist="+listThird);
	     return listThird.size();
	}
	
	  public void addCustomobjects(){
	  //Question4
             ArrayList<ArrayListTask > list=new ArrayList<>();
             ArrayListTask obj1=new ArrayListTask();
             ArrayListTask obj2=new ArrayListTask();
               list.add(obj1);
               list.add(obj2);
             System.out.println("arrayList:"+list);
             int length=list.size();
             System.out.println("size of list:"+length);
          
	}
	public  void  addIntStringCustomObjects(int[] numbers, String []studentName){
	//Queastion5
           ArrayList<Object> list=new ArrayList<Object>();
 	  
 	  for(int run=0; run<numbers.length;run++){
 	     list.add(numbers[run]);
 	     }
 	   for(int run=0; run<studentName.length;run++){
 	    list.add(studentName[run]);
 	     }
 	   ArrayListTask obj1=new ArrayListTask();
 	   ArrayListTask obj2=new ArrayListTask();
 
 	     list.add(obj1);
             list.add(obj2);
             
             System.out.println("arraylist:"+list);
             int len=list.size();
             System.out.println("arraylist size"+len);
         }
         
         public void  findIndex(String[] animals){
         //Question6
   	 ArrayList<String> list=new ArrayList<String>();
   	 for(int run=0; run<animals.length; run++){
   	// System.out.println("enter the animalsname");
   
   	 list.add(animals[run]);
   	 }
   	 
   	list.indexOf("nivas");
   	System.out.println("arrayList:"+list);
   	int len = list.size();
   	System.out.println("arrayList size:"+len);
   	System.out.println(list.indexOf("nivas"));
   	 }
	
	public void stringIterator(){
	//Question7
		ArrayList<String> list= new ArrayList<String>();
		
		for(int run=0;run<5;run++){
		System.out.println("enter   String");
		String string=input.next();
		list.add(string);
		}
        Iterator itr=list.iterator();
		while(itr.hasNext()){
		System.out.println("list elements" +itr.next());
      	}
	    System.out.println("arraylistSize="+list.size());
	    System.out.println("arraylist="+list);
	}
	public void printStringGivenIndex(){
	//Question8
		ArrayList<String> list= new ArrayList<String>();
		
		for(int run=0;run<4;run++){
		System.out.println("enter  one String");
		String string=input.next();
		list.add(string);
		}
		//int print =list.indexOf(4);
		System.out.println("please enter the index");
		int index=input.nextInt();
          
                System.out.println("print the string  ="+list.get(index));	
	        System.out.println("arraylistSize="+list.size());
	        System.out.println("arraylist="+list);
	}
	
       public void findIndexOfDuplicate(){
       //Question9 doubts
         ArrayList<String> list=new ArrayList<String>();
         
          for(int run=0; run<5; run++){
          System.out.println("please enter the five String");
          String name=input.next();
          list.add(name);
          }
          list.indexOf("nivas");
          list.lastIndexOf("nivas");
          }
          
	public void addingSecondPosition(){
	//Question10
	
	 ArrayList<String> list=new ArrayList<String>();
	 for(int run=0; run<5;run++){
	 System.out.println("enter the string");
	 String string=input.nextLine();
	 list.add(string);
	 }
	 System.out.println("enter the one string");
	 String add=input.next();
	 list.add(2 , add);
	 
	 System.out.println("arrayList="+list);
	 int len=list.size();
	 System.out.println("arrayList size="+len); 
	 
	  }
	  
	public void createSecondArrayList(){
	//Question11
   
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0;run<10;run++){
	System.out.println("please enter the 10 string");
	String string=input.next();
	list.add(string);
	}
	
	List<String> listTwo=new ArrayList<String>();
	listTwo=list.subList(3,8);
	//list.add(in);
        System.out.println(listTwo);
        }
        

        public void createThirdArrayList(){
        //Question12
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0; run<3;run++){
	System.out.println("Enter the five String");
	String string =input.next();
	list.add(string);
	}
	
	ArrayList<String> listTwo=new ArrayList<String>();
	for(int run=0; run<5;run++){
	System.out.println("Enter the three String");
	String two =input.next();
	listTwo.add(two);
	}
	
	ArrayList<String> listThree=new ArrayList<String>();
	listThree.addAll(list );
	listThree.addAll(listTwo);
	System.out.println("array third list"+listThree);
	System.out.println("firstList+"+list);
	System.out.println("array second list"+listTwo);
       }
       
	
	public void createThirdListUseAboveList(){
	//Question13
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0; run<5;run++){
	System.out.println("Enter the five name");
	String name=input.next();
	list.add(name);
	}
	
	ArrayList<String> listTwo=new ArrayList<String>();
	for(int run=0; run<3;run++){
	System.out.println("Enter the three name");
	String nameTwo =input.next();
	listTwo.add(nameTwo);
	}
	
	ArrayList<String> listThree=new ArrayList<String>();
	listThree.addAll(listTwo);
	listThree.addAll(list );
	System.out.println("array third list"+listThree);
	int len=listThree.size();
	//System.out.println("first List+"+list);
	//System.out.println("array second list"+listTwo);
	System.out.println("arrrayList size"+len);
       }	
       
	public void removeDecimalValue(){
	//Question14
	 ArrayList<Double> list=new ArrayList<Double>();
	 Scanner input=new Scanner(System.in);
	 for(int run=0; run<5; run++){ 
	 try{
	 System.out.println("print the value");
	 double value=input.nextDouble();
	  list.add(value);
	  }
	 
	  catch(InputMismatchException e){
	  System.out.println("please enter the decimal value");
	  break;
	 
	  }
	}
	  System.out.println("enter index 0 to 4");
	  int in=input.nextInt();
	   
	try { 
	  System.out.println("REMOVED VALUE "+list.remove(in));
	} 
	catch(IndexOutOfBoundsException e) {
	System.out.println("arraylist con't removed because your giveing wrong input");
 
	}
	
	System.out.println("arrayList="+list);
	  int len=list.size();
	  System.out.println("size of array list="+len);
	  }
        
	public void removeForthDecimalValue(){
	//Question15
	ArrayList<Double> list =new ArrayList<Double>();
	for(int i=0; i<5; i++){
	System.out.println("enter the value");
	double value=input.nextDouble();
	list.add(value);
	}
	
     System.out.println("removed element"+ list.remove(3));
      System.out.println("arrayList="+list);
      int len=list.size();
      System.out.println("size of arrayList="+len);
      }
      public void removeLongValue(){
      //Question16
       ArrayListTask list=new ArrayListTask();
       for(int i=0; i<10;i++){
       System.out.println("enter the long value");
       Long in=input.nextLong();
       list.add(in);
      }
      list.removeRange(4,8);
     
      int len=list.size();
      System.out.println("Arraylist size"+len);
      System.out.println("Arraylist"+list);
     }     
    public  void removeElementFromFirst(){
      ArrayList<String> list= new ArrayList<String>();
      for(int i=0; i<5; i++){
      System.out.println("enter name to first");
      String name=input.next();
      list.add(name);
    }
   
   ArrayList<String> listTwo= new ArrayList<String>();
    for(int i=0; i<3; i++){
    System.out.println("enter name second");
    String name=input.next();
    listTwo.add(name);
    }
    list.removeAll(listTwo);
    System.out.println("arrayList"+list);
    int len=list.size();
    System.out.println("size of Array list"+len);
    }
     
    public  void  removeValueNotPresent(){
   //Question18
    ArrayList<String> firstList= new ArrayList<String>();
    for(int i=0; i<5; i++){
    System.out.println("enter name to first");
    String name=input.next();
   firstList.add(name);
    }
   ArrayList<String> secondList= new ArrayList<String>();
    for(int i=0; i<3; i++){
    System.out.println("enter name second");
    String name=input.next();
    secondList.add(name);
    }
    firstList.retainAll(secondList);
    System.out.println("arrayList"+firstList);
    int len=firstList.size();
    System.out.println("size of first Array list"+len);
    System.out.println("arrayList"+secondList);
    int length=secondList.size();
     System.out.println("size of second  Array list"+len);
    }
    
      
 	public void removeAllLongValues(){
 	//Question19
 	ArrayList<Long> list=new ArrayList<Long>();	
      	for(int i=0; i<10;i++){
      	System.out.println("enter teh long value");
      	Long in=input.nextLong();
      	list.add(in);
      	}
      	System.out.println("before list="+list);
      	int len=list.size();
      	System.out.println("size  of arraylist="+len);
      	list.removeAll(list);
      	System.out.println("after list="+list);
      	int length=list.size();
      	System.out.println("after size="+length);
      	}
      	
      	public void checkList(String[] name, String checkName){
      	//Question20
        ArrayList<String> list=new ArrayList<String>();
          for(int i=0; i<name.length; i++){
    
          list.add(name[i]);
        }
       
       System.out.println(list.contains(name));
       int length=list.size();
       System.out.println("size of arraylist"+length);
       System.out.println("arraylist"+list);
  }
       
     
	public static void main(String[] args){
	 ArrayListTask obj=new ArrayListTask();
	// Scanner input=new Scanner(System.in);
	 System.out.println("enter your choice");
	  int choice=input.nextInt();
	  
	 switch (choice) {
	 
                case 1:
                   obj. createArrayList();
                   System.out.println(" successfully");
                
                break;
                
                case 2:
                System.out.println("enter the number of string you want too");
                 int  count=input.nextInt();
                 String[]names=new String[count];
                 System.out.println("enter the " +count+" string");
		for(int run=0;run<count;run++){
		System.out.println("enter any String");
		names[run]=input.next();

		}
		int size =obj.addFiveString(names);
                   System.out.println("size of list"+ size);
                   System.out.println("successfully");
                break;
              
                case 3:
                    System.out.println("enter the number  of string you want too");
                    count =input.nextInt();
                    int number[]=new int[count];
                    System.out.println("enter the " + count+ "number");
                    for(int run=0;run<count;run++){
		   System.out.println("enter any  number");
		   number[run]=input.nextInt();
                 }
                   size=obj.addFiveIntegers(number);
                   System.out.println("SIZE OF LIST" + size);
                   System.out.println("successfully");
                break;
                
                case 4:
                    obj.addCustomobjects();
                   System.out.println(" successfully");
                break;
              
              
                case 5:
                     System.out.println("how much integers you need to add list");
                     count=input.nextInt();
                     int  numbers[] =new int[count];
                     System.out.println("enter the" + count+ "numbers");
                     for(int run=0; run<count;run++){
                     System.out.println("enter the number");
                     numbers[run]=input.nextInt();
                     }
                     System.out.println("how much string  you need to add list");
                      count=input.nextInt();
                       String studentName[] =new String[count];
                      for(int run=0; run<count; run++){
                      System.out.println("enter the name");
                      studentName[run]=input.next();
                    } 
       
                     obj.addIntStringCustomObjects(numbers, studentName);
                     System.out.println(" successfully");
                break;
              
              
                case 6:
                     System.out.println("how much string you need");
                      count=input.nextInt();
                      String animals[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      animals[run]=input.next();
                      }
                      
                   obj.findIndex(animals);
                   System.out.println(" successfully");
                break;
              
              
                case 7:
                   obj.stringIterator();
                   System.out.println(" successfully");
                break;
              
              
                case 8:
                   obj.printStringGivenIndex();
                   System.out.println(" successfully");
                break;
              
              
                case 9:
                   obj. findIndexOfDuplicate();
                   System.out.println(" successfully");
                break;
              
              
                case 10:
                   obj.addingSecondPosition();
                   System.out.println(" successfully");
                break;
              
              
                case 11:
                   obj.createSecondArrayList();
                   System.out.println(" successfully");
                break;
              
              
                case 12:
                   obj.createThirdArrayList();
                   System.out.println(" successfully");
                break;
              
              
                case 13:
                   obj.createThirdListUseAboveList();
                   System.out.println(" successfully");
                break;
              
              
                case 14:
                   obj.removeDecimalValue();
                  System.out.println(" successfully");
                break;
              
              
                case 15:
                   obj.removeForthDecimalValue();
                   System.out.println(" successfully");
                break;
              
              
                case 16:
                   obj.removeLongValue();
                   System.out.println(" successfully");
                break;
              
              
                case 17:
                   obj.removeElementFromFirst();
                   System.out.println(" successfully");
                break;
              
              
                case 18:
                   obj.removeValueNotPresent();
                   System.out.println(" successfully");
                break;
              
              
                case 19:
                   obj.removeValueNotPresent();
                   System.out.println(" successfully");
           
                break;
                
                case 20:
                String[] name = new String[5];
                System.out.println("enter 5 strings");
                for(int i=0; i<5; i++){
        	name [i]=input.next();
        	}
        	System.out.println("enter strings to find List");
        	String checkName=input.next();
                   obj.checkList(name,checkName);
                   System.out.println(" successfully");
                break;
                
           }      
	 }
	}
	
	
	
	
