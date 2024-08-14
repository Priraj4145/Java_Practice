package expdemo;
class A{
	int i=10;
}
class B extends A{
	int j;
}
public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		A a1=new A();
		B b1=new B();
		A a2=b1;
		try {
			Thread.sleep(5000);
		}
		catch(Exception e){
			
		}
		//int arr[]= {10,20,30};
		//System.out.println(arr[10]);
		try {
			B b3=(B)a1;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		int i=10;
		double d1=i;
		System.out.println(b1.i);
		System.out.println(b1.j);
		System.out.println("done");
      
	}
            
}
