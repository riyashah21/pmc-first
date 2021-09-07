package Array_practise;
class Student{
	public int roll_no;
	public String name;
	Student(int roll_no,String name){
		this.roll_no=roll_no;
		this.name=name;
		
	}
}
public class myClassArray {

	public static void main(String[] args) {
		
	Student[] arr;
	arr=new Student[5];
	arr[0]=new  Student(1, "aman");
	arr[1]=new Student(2, "vaibhv");
	arr[2]=new Student(3, "shikhar");
	arr[3]=new Student(4, "dharmes");

	for(int i=0;i<arr.length;i++)
		System.out.println("element"+" "+" :"+ arr[i].roll_no+" "+arr[i].name);
}
}
	