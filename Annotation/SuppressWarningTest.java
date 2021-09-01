package Annotation;

class Deprecated_test
{
    @Deprecated
    public void Display()
    {
        System.out.println("Deprecatedtest display()");
    }
}
  
public class SuppressWarningTest
{
    // If we comment below annotation, program generates
    // warning
    @SuppressWarnings({"checked", "deprecation"})
    public static void main(String args[])
    {
        Deprecated_test d1 = new Deprecated_test();
        d1.Display();
    }
}