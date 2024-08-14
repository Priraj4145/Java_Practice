package day2;
class A1{
	public void method1() {
		System.out.println("from method no arg");
	}
	public void method1(int i) {
		method1(i,20);
		System.out.println("from method 1args int type "+i);
	}
	public void method1(int i,int j) {
		System.out.println("from method args int,int type "+i+","+ j);
		method1("Raja",j);
		
	}
	public void method1(String Name,int j) {
		method1();
		System.out.println("from method 1args String,int int type "+Name+","+j);
		
		
	}
	
}

public class Manager3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj=new A1();
		obj.method1(100);

	}

}
