package Practicals;

import java.io.*;
import java.util.*;
 
class Practical1
{
 
    static int findRepeating(int[] arr, int n)
    {
        
 
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        return sum - (((n - 1) * n) / 2);
    }
 
    // Driver code
    public static void main(String args[])
    {
        int[] arr = { 1,2,3,4,4 };
        int[] arr1 = { 1,2,3,4,2 };
        int n = arr.length;
        System.out.println("The duplicate element is "+findRepeating(arr, n));
        System.out.println("The duplicate element is "+findRepeating(arr1, n));
    }
}
 
