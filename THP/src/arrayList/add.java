package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class add {
  public static void main(String[] args) {
	  
    ArrayList<String> cars = new ArrayList<String>();
    
    //.ADD()
    
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars.add("Prueba"));
    
    System.out.println(cars);

    //ADD(p,n)

    cars.add(3,"ADD");
    System.out.println(cars);
     
    //.GET()
    
    System.out.println(cars.get(0));
    System.out.println(cars.get(1));

    //.SET(p,n)
    
    System.out.println(cars.set(0, "Audi"));
    System.out.println(cars);
    
    //.REMOVE()
    
    System.out.println(cars.remove(0));
    System.out.println(cars);
    
    System.out.println(cars.remove("Ford"));
    System.out.println(cars);

    System.out.println("Que hace?");
    System.out.println(cars.remove(String.valueOf("BMW")));
    System.out.println(cars);
    
    //SIZE()
   
    System.out.println(cars.size());
    
    //WHILE
    
    int j=0;
    while (j < cars.size()) {
        System.out.println(cars.get(j));
        j++;
    }
    //FOR
    
    for (int i=0; i < cars.size(); i++) {
        System.out.println(cars.get(i));
    }
    
    // Sort cars
    
    Collections.sort(cars);  
    
    //FOR EACH
    
    for (String i : cars) {
        System.out.println(i);
    }
    
    cars.clear();
    System.out.println(cars.size());
    System.out.println(cars);
   
  }
}