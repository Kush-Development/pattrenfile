import java.util.ArrayList;
 class addArrayLIst{

    
    

    public static void main(String[]args){

System.out.println("hello");
ArrayList<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("papaya");
fruits.add("orange");
 
fruits.add("45");
fruits.add("chiku");
fruits.add("Banana");


System.out.println("Element in the ArrayList");

      for(String t : fruits)
      {
         System.out.println(t);  
      }



    System.out.println("----------------------------------");



    System.out.println("Element in the ArrayList  equals   banana  ");

    for(String k : fruits)
    {
    
        if(k.equals("Banana"))
        
        {
          System.out.println(k);  
        }
       

  }




System.out.println("----------------");

System.out.println("Element in the ArrayList contains k");

      for(String k : fruits)
      {
      
          if(k.contains("k"))
          
          {
            System.out.println(k);  
          }
         

    }

    System.out.println("-----------------------");

    System.out.println("Element in the ArrayList end with e latter");

    for(String k : fruits)
    {
    
        if(k.endsWith("e"))
        
        {
          System.out.println(k);  
        }
       

  }

System.out.println("----------------------------");

  System.out.println("Fruits with 'p' in the 3rd position:");

  for (String k : fruits) {
      if (k.length() >= 3 && k.charAt(2) == 'p') {
          System.out.println(k);
      }



}

    
}  



 }

