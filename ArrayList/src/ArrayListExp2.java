import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(70);
		list.add(70);		
		list.add(70);
		list.add(5);
		
		//list.stream().filter((temp)-> temp >= 40).forEach(e->System.out.println(e));
		list.stream().map(temp-> temp*2).forEach(e -> System.out.println(e));
		System.out.println("===========================================================");
		list.stream().sorted().forEach(e->System.out.print(e+", "));
		System.out.println();
		System.out.println("===========================================================");
		
		//list.stream().sorted().forEach(e->System.out.println(e));
		list.stream().sorted(Comparator.reverseOrder()).forEach(e-> System.out.print(e +", "));
		System.out.println(list);
		
		list.stream().distinct().forEach(temp->System.out.print(temp +","));
		

	}

}
