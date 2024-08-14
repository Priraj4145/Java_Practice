package day4;
interface cat{
	void action();
}

public class polymorphismEx2 implements Comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
///one method
		/*cat c=new cat() {

			@Override
			public void action() {
				// TODO Auto-generated method stub
				
			}
			
		};*/
//another method (lambda expression)
		cat c1=()->System.out.println("cat is running");
         c1.action();
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
