package Annotation;

class Base121
{
     public void display()
     {
         System.out.println("Base display()");
     }
}
class First_base extends Base121
{
     @Override
     public void display(int x)
     {
         System.out.println("Derived display(int )");
     }
  
     public static void main(String args[])
     {
         Derived obj = new Derived();
         obj.display();
     }
}