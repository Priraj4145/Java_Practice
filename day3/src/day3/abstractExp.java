package day3;
abstract class Dev{
	public abstract void method2() ;
		
	public void method1() {
		System.out.println("from method 2");
	}
}
class Dev2 extends Dev{
	public void method1() {
		System.out.println("from method 1");
	}
	@Override
	public void method2() {
		System.out.println("Override abstract method");
	}
	
}

public class abstractExp {

	public static void main(String[] args) {
		Dev2 obj=new Dev2();
		obj.method2();
		// TODO Auto-generated method stub

	}

}
