package sheetal;

import java.util.Arrays; 
 class Element {
public static void main(String[] args){   
    
    int[] array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
            
    String[] array2 = {
            "circle",
			
            "rectangle",
            "square",
            "java",
            "Programming",
            "access"
        };        
    System.out.println(" numeric array : "+Arrays.toString(array1));
    Arrays.sort(array1);
    System.out.println("Sorted numeric array : "+Arrays.toString(array1));
    
    System.out.println(" string array : "+Arrays.toString(array2));
    Arrays.sort(array2);
    System.out.println("Sorted string array : "+Arrays.toString(array2));
    }
}




