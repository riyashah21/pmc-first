package Third_Generics;

import java.io.*;
import java.util.Scanner;

class gfg
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        int n=sc.nextInt();
        if(n==1)
        {
            String s=sc.next();
            Practice<String> Str=new Practice<String>(s);
            Str.showType();
        }
        else
        {
            Integer p=sc.nextInt();
            Practice<Integer> integer=new Practice<Integer>(p);
            integer.showType();
        }
        }
    }
}

 // } Driver Code Ends
//User function Template for Java

public class Practice<T> {
    private T data;

    public Practice(T data) {
        this.data = data;
    }

    public void showType() {
        System.out.println(data.getClass().getSimpleName());
        System.out.println(data);
    }

    //Add your code here. Make a private data variable, constructor which intialize 
    // the data variable and a method showType().
 
}

