package first_enum;

enum Color1
{
    RED, GREEN, BLUE;
  
    // enum constructor called separately for each
    // constant
    private Color1()
    {
        System.out.println("Constructor called for : " +
        this.toString());
    }
  
    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}
  
public class Test3
{    
    // Driver method
    public static void main(String[] args)
    {
        Color1 c1 = Color1.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}