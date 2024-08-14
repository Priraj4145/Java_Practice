package day3;
abstract class Sample{
	public abstract void dep(int amt);
	public abstract void with(int amt);
	double totamt=15000;
	}
class Atm extends Sample{
@Overrride
	
	public void dep(int amt) {
		totamt=totamt+amt;
		System.out.println("Deposit: "+totamt);
	}
@Override
	public void with(int amt) {
	totamt=totamt-amt;
	System.out.println("wihdraw:"+totamt);
	}



}

public class abstractExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Atm obj=new Atm();
		obj.dep(5000);
		obj.with(5000);

	}

}
