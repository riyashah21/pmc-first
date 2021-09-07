package Practicals;
import java.util.*;
  
public class ArraytoCollection {
    public static void main(String args[])
    {
        
        String Array[]
            = { "a","gfd","dfj","djs" };
        
       
        System.out.println(" input: "
                           + Arrays.toString(Array));
       
        List AList = Arrays.asList(Array);
        
        
        System.out.println("Output "
                           + AList);
    }
}