
import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("ddd");		
		list.add("fff");
		list.add("ggg");
		
		list.stream().filter(e ->e.equals("ccc")).forEach(e->System.out.println(e));
		System.out.println("===========================================================");
		
		list.stream().map(e-> e.concat("fff")).forEach(e -> System.out.println(e));
		System.out.println("===========================================================");
		
		list.stream().sorted().forEach(e->System.out.print(e+", "));
		System.out.println();
		System.out.println("===========================================================");
		
		//list.stream().sorted().forEach(e->System.out.println(e));
		list.stream().sorted(Comparator.reverseOrder()).forEach(e-> System.out.print(e +", "));
		System.out.println(list);
		System.out.println("===========================================================");
		list.stream().distinct().forEach(e->System.out.print(e +","));
		

	}

}
