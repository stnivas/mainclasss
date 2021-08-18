
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

	public void stringIterator(String[] runs){
	//Question7
		ArrayList<String> list= new ArrayList<String>();
		
		for(int run=0;run<runs.length;run++){
		//System.out.println("enter   String");
	//	String string=input.next();
		list.add(runs[run]);
		}
        Iterator itr=list.iterator();
		while(itr.hasNext()){
		System.out.println("list elements" +itr.next());
      	}
	    System.out.println("arraylistSize="+list.size());
	     System.out.println("arraylist="+list);

	}
	public void printStringGivenIndex(String []adding){
	//Question8
		ArrayList<String> list= new ArrayList<String>();
		
		for(int run=0;run<adding.length;run++){
		//System.out.println("enter  one String");
		//String string=input.next();
		list.add(adding[run]);
		}
		int print =list.indexOf(4);
	System.out.println("please enter the index");
		int index=input.nextInt();
          
                System.out.println("print the string  ="+list.get(index));	
	        System.out.println("arraylistSize="+list.size());
	        System.out.println("arraylist="+list);
	}
	
       public void findIndexOfDuplicate(String[] duplicate){
       //Question9 doubts
         ArrayList<String> list=new ArrayList<String>();
         
          for(int run=0; run<duplicate.length; run++){
          //System.out.println("please enter the five String");
       //   String name=input.next();
          list.add(duplicate[run]);
          }
        System.out.println(  list.indexOf("nivas"));
       System.out.println(   list.lastIndexOf("nivas"));
          }
          
	public void addingSecondPosition(String [] added){
	//Question10
	
	 ArrayList<String> list=new ArrayList<String>();
	 for(int run=0; run<added.length;run++){
	// System.out.println("enter the string");
	// String string=input.nextLine();
	 list.add(added[run]);
	 }
	 System.out.println("enter the one string");
	 String add=input.next();
	 list.add(2 , add);
	 
	 System.out.println("arrayList="+list);
	 int len=list.size();
	 System.out.println("arrayList size="+len); 
	 
	  }
	  
	public void createSecondArrayList(String[] value){
	//Question11
   
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0;run<value.length;run++){
	//System.out.println("please enter the 10 string");
	//String string=input.next();
	list.add(value[run]);
	}
	
	List<String> listTwo=new ArrayList<String>();
	listTwo=list.subList(3,8);
	//list.add(in);s
        System.out.println(listTwo);
        }
        

        public void createThirdArrayList(String[] valueOne,String[] valueTwo){
        //Question12
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0; run<valueOne.length;run++){
	//System.out.println("Enter the five String");
	//String string =input.next();
	list.add(valueOne[run]);
	}
	
	ArrayList<String> listTwo=new ArrayList<String>();
	for(int run=0; run<valueTwo.length;run++){
	//System.out.println("Enter the three String");
//	String two =input.next();
	listTwo.add(valueTwo[run]);
	}
	
	ArrayList<String> listThree=new ArrayList<String>();
	listThree.addAll(list );
	listThree.addAll(listTwo);
	System.out.println("array third list"+listThree);
	System.out.println("firstList+"+list);
	System.out.println("array second list"+listTwo);
       }
       
	
	public void createThirdListUseAboveList(String [] one, String[] two){
	//Question13
	ArrayList<String> list=new ArrayList<String>();
	for(int run=0; run<one.length;run++){
	//System.out.println("Enter the five name");
	//String name=input.next();
	list.add(one[run]);
	}
	
	ArrayList<String> listTwo=new ArrayList<String>();
	for(int run=0; run<two.length;run++){
	//System.out.println("Enter the three name");
	//String nameTwo =input.next();
	listTwo.add(two[run]);
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
       
	public void removeDecimalValue(Double[] first){
	//Question14
	 ArrayList<Double> list=new ArrayList<Double>();
	 Scanner input=new Scanner(System.in);
	 for(int run=0; run<first.length; run++){ 
	 try{
	// System.out.println("print the value");
	 //double value=input.nextDouble();
	  list.add(first[run]);
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
        
	public void removeForthDecimalValue(Double[] second){
	//Question15
	ArrayList<Double> list =new ArrayList<Double>();
	for(int run=0; run<second.length; run++){
	   //System.out.println("enter the value");
	  //ssdouble value=input.nextDouble();
	list.add(second[run]);
	}
	
     System.out.println("removed element"+ list.remove(3));
      System.out.println("arrayList="+list);
      int len=list.size();
      System.out.println("size of arrayList="+len);
      }
      public void removeLongValue(Long[] third){
      //Question16
       ArrayListTask list=new ArrayListTask();
       for(int run=0; run<third.length;run++){
      // System.out.println("enter the long value");
    //   Long in=input.nextLong();
       list.add(third[run]);
      }
      list.removeRange(4,8);
     
      int len=list.size();
      System.out.println("Arraylist size"+len);
      System.out.println("Arraylist"+list);
     }     
    public ArrayList<String> removeElementFromFirst(String[] firstValue,String[] secondValue){
		//Question17
      ArrayList<String> list= new ArrayList<String>();
      for(int run=0; run<firstValue.length; run++){
     // System.out.println("enter name to first");
      //String name=input.next();
      list.add(firstValue[run]);
    }
   
   ArrayList<String> listTwo= new ArrayList<String>();
    for(int run=0; run<secondValue.length; run++){
   
  ///System.out.println("enter name second");
  //  String name=input.next();
    listTwo.add(secondValue[run]);
    }
    list.removeAll(listTwo);
    //System.out.println("arrayList"+list);
   // int len=list.size();
    //System.out.println("size of Array list"+len);
	return list;
    }
     
    public  void  removeValueNotPresent(String[] numOne,String[] numTwo){
   //Question18
    ArrayList<String> firstList= new ArrayList<String>();
    for(int run=0; run<5; run++){
    //System.out.println("enter name to first");
   // String name=input.next();
   firstList.add(numOne[run]);
    }
   ArrayList<String> secondList= new ArrayList<String>();
    for(int run=0; run<3; run++){
   // System.out.println("enter name second");
   // String name=input.next();
    secondList.add(numTwo[run]);
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
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String runs[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      runs[run]=input.next();
                      }
				
                    obj.stringIterator(runs);
				  // System.out.println("arraylist="+list);
                   System.out.println(" successfully");
                break;
              
              
                case 8:
				       System.out.println("how much string you need");
                      count=input.nextInt();
                      String adding[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      adding[run]=input.next();
                      }
				  //System.out.println("please enter the index");
	             	//int index=input.nextInt();
                   obj.printStringGivenIndex(adding);
                   System.out.println(" successfully");
                break;
              
              
                case 9:
				
				    
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String duplicate[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      duplicate[run]=input.next();
                      }
                   obj. findIndexOfDuplicate(duplicate);
                   System.out.println(" successfully");
                break;
              
              
                case 10:
				    
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String added[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      added[run]=input.next();
				
					  }
                   obj.addingSecondPosition(added);
                   System.out.println(" successfully");
                break;
              
              
                case 11:
				
				  
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String value[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      value[run]=input.next();
				
					  }
                   obj.createSecondArrayList(value);
                   System.out.println(" successfully");
                break;
              
              
                case 12:
				
				  
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String valueOne[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      valueOne[run]=input.next();
				
					  }	  
				      System.out.println("how much string you need list two");
                      count=input.nextInt();
                      String valueTwo[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      valueTwo[run]=input.next();
				
					  }
                   obj.createThirdArrayList(valueOne, valueTwo);
                   System.out.println(" successfully");
                break;
              
              
                case 13:
				
				
				      System.out.println("how much string you need");
                      count=input.nextInt();
                      String one[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      one[run]=input.next();
				
					  }	  
				      System.out.println("how much string you need list two");
                      count=input.nextInt();
                      String two[]=new String [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      two[run]=input.next();
				
					  }
                   obj.createThirdListUseAboveList(one, two);
                   System.out.println(" successfully");
                break;
              
              
                case 14:
				
				
				      System.out.println("how much decimal value you need");
                      count=input.nextInt();
                     Double first[]=new Double [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      first[run]=input.nextDouble();
					  }
                   obj.removeDecimalValue(first);
                  System.out.println(" successfully");
                break;
              
              
                case 15:
				
				      System.out.println("how much decimal value you need");
                      count=input.nextInt();
                      Double second[]=new Double [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      second[run]=input.nextDouble() ; 
					  }
                   obj.removeForthDecimalValue(second);
                   System.out.println(" successfully");
                break;
              
              
                case 16:
				
				      System.out.println("how much decimal value you need");
                      count=input.nextInt();
                      Long third[]=new  Long [count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      third[run]=input.nextLong() ; 
					  }
                   obj.removeLongValue(third);
                   System.out.println(" successfully");
                break;
              
              
                case 17:
								
				      System.out.println(" Enter the number of values : ");
                      count=input.nextInt();
                      String firstValue[]=new  String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      firstValue[run]=input.next() ; 
					  }
					  System.out.println("how much decimal value you need list two");
                      count=input.nextInt();
                      String secondValue[]=new String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      secondValue[run]=input.next() ; 
					  }
				
  			ArrayList<String> list=	 obj.removeElementFromFirst(firstValue,secondValue);
			    int len=list.size();
				System.out.println("arraylist ="+list);
				System.out.println("arraylist size="+len);
				 
                   System.out.println(" successfully");
                break;
              
              
                case 18:
							
				      System.out.println(" Enter the number of values : ");
                      count=input.nextInt();
                      String numOne[]=new  String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      numOne[run]=input.next() ; 
					  }
					  System.out.println("Enter the number of values ");
                      count=input.nextInt();
                      String numTwo[]=new String[count];
                      System.out.println("enter the " + count+"string");
                      for(int run=0;  run<count; run++){
                      numTwo[run]=input.next() ; 
					  }
                   obj.removeValueNotPresent(numOne, numTwo);
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
	
	
	
	
	
