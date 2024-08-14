import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("Mona");
		list.add(true);
		list.add(10);
		list.add(30.3f);
		list.add('a');
		
		System.out.println(list);
		//list.stream().forEach((p)->System.out.println(p));
		Iterator readData = list.iterator();//only for the for loop
		//list.listIterator(); //bidirection
		while(readData.hasNext()) {
			System.out.println(readData.next());
		}

	}

}
