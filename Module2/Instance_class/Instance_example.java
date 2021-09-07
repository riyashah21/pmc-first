package Instance_class;
class Parent1{
	int value=1000;
	
}
class child1 extends Parent1{
	int value =10;
}

public class Instance_example {
	public static void main(String[] args) {
		Parent1 cobj=new child1();
		Parent1 par=cobj;
		if(par instanceof child1) {
			System.out.println("valye accessed tgrough"+"parent reference with "+ ((child1)par).value);
		}
	}

}
