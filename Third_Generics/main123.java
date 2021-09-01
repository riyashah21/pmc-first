package Third_Generics;

class Test121<T>
{
    // An object of type T is declared
    T obj;
    Test121(T obj) {  this.obj = obj;  }  // constructor
    public T getObject()  { return this.obj; }
}
   
// Driver class to test above
class Main123
{
    public static void main (String[] args)
    {
        // instance of Integer type
        Test121 <Integer> iObj = new Test121<Integer>(15);  
        System.out.println(iObj.getObject());
   
        // instance of String type
        Test121 <String> sObj =
                          new Test121<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
       iObj = sObj; 
    }
}