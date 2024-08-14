package expdemo;
class Person extends RuntimeException{
	int age;
	public Person(){
		
		
	}
public Person(String Error){
		super(Error);
		
	}
	
}

public class Manager7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Person person1=null;   //it throws NullPointerException
		//System.out.println(10/0);

       /* try {
        	//throw new ArithmeticException("Invalid access"); //cutomize Exception
        	System.out.println(10);
        }
        catch(Exception e) {
        	e.printStackTrace();
        }*/
		System.out.println(10);
        Person person1=new Person(); 
        person1.age=10;
        if(person1.age > 0) {
        	System.out.println("person age is "+person1.age);
        }
        else {
        	throw new Person("It is invalid age");
        }
        System.out.println("done");
	}

}
