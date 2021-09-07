package Instance_class;
class Parent{
	
}
class child extends Parent{ }

public class Instance {
	public static void main(String[] args) {
		 //Parent pobj= new Parent();
		 Parent pobj=new child();
		if(pobj instanceof child)
			System.out.println("pobj is instance of child");
		else
			System.out.println("pobj is not child");
	}
}
