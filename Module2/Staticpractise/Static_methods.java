package Staticpractise;

class Student 
{
    String name;
    int rollNo;
    static String cllgName;
    static int counter = 0;
      
public Student(String name) 
    {
        this.name = name;
         this.rollNo = setRollNo();
    }
      
    // getting unique rollNo
    // through static variable(counter)
    static int setRollNo()
    {
        counter++;
        return counter;
    }
      
    // static method
    static void setCllg(String name){
        cllgName = name ;
    }
      
    // instance method
    void getStudentInfo(){
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);
        System.out.println("cllgName : " + cllgName);
    }
}
  

public class Static_methods
{
    public static void main(String[] args)
    {
        
        Student.setCllg("XYZ");
      
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
          
        s1.getStudentInfo();
        s2.getStudentInfo();
          
    }
}