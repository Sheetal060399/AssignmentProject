package sheetal;

import java.util.*;
public class Common {
public static void main(String[] args) 
    {
       String[] array1 = {"Python", "JAVA", "PHP", "Program", "Developer", "SQL"};
 
       String[] array2 = {"SQL", "access", "rectangle", "boy", "JAVA", "circle", "Program"};
       
       System.out.println("Array1 : "+Arrays.toString(array1));
       System.out.println("Array2 : "+Arrays.toString(array2));
 
       HashSet<String> set = new HashSet<String>();
 
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    set.add(array1[i]);
                }
            }
        }
 
        System.out.println("Common element : "+(set));    
    }
}
