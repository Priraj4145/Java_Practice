package day2;
class A{
	public void Method1() {
		System.out.println("from method");
	}
	public A Method2() {
		A obj=new A();
		return obj;
	}
	public int Method3() {
		long val=30000l;
		return (int)val;
	}
}

public class Manager2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.Method3();
        System.out.println(obj.Method3());
	}

}
