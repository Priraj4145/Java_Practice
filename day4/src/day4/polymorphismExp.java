package day4;
interface Student{
	String name="VSB";
	public void action();
	
	
}
class StudentImp implements Student{
	public void action() {
		System.out.println("Student is studying");
	}
	
}
class Teacher implements Student{

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("Teacher is assisting");
		
	}
	
}
class Worker implements Student{

	@Override
	public void action() {
		// TODO Auto-generated method stub
		System.out.println("worker is tired");
		
	}
	
} 

public class polymorphismExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student obj=new StudentImp();
     obj.action();
     Student obj1=new Worker();
     obj1.action();
     Student obj2=new Teacher();
     obj2.action();
	}

}
