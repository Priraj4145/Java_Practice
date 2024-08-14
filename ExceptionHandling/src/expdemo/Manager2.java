package expdemo;

public class Manager2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(1);
String s1="abc123";
//int i=Integer.parseInt(s1);

try {
	int i=Integer.parseInt(s1);
}
catch(Exception e){
	System.out.println(e);
}
System.out.println("2");
System.out.println("Done");
	}

}
