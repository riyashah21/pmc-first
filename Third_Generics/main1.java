package Third_Generics;

class Test11<T>
{
    // An object of type T is declared
    T obj;
    Test11(T obj) {  this.obj = obj;  }  // constructor
    public T getObject()  { return this.obj; }
}
   
// Driver class to test above
class Main1
{
    public static void main (String[] args)
    {
        // instance of Integer type
        Test11 <Integer> iObj = new Test11<Integer>(15);
        System.out.println(iObj.getObject());
   
        // instance of String type
        Test11 <String> sObj =
                          new Test11<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
    }
}