import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
import java.util.stream.Collectors;

class Employee{
	private int empid;
	private String name;
	private String desig;
	private int sal;
	private String addr;
	
	
	public Employee(int empid, String name, String desig, int sal, String addr) {
		super();
		this.empid = empid;
		this.name = name;
		this.desig = desig;
		this.sal = sal;
		this.addr = addr;
	}

	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesig() {
		return desig;
	}


	public void setDesig(String desig) {
		this.desig = desig;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", desig=" + desig + ", sal=" + sal + ", addr=" + addr
				+ "]";
	}
	
}
public class ArrayListExp4 {

	//private static final Collector Collector = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee(1,"aba","tester",50000,"Bangalore"));
		emp.add(new Employee(2,"bab","developer",30000,"Chennai"));
		emp.add(new Employee(3,"cdd","Analyst",70000,"Madurai"));
		emp.add(new Employee(4,"d","Developer",80000,"Bangalore"));
		emp.add(new Employee(5,"e","Analyst",10000,"Madurai"));
		emp.add(new Employee(6,"f","Tester",50000,"chennai"));
		//emp.add(new Employee(1,"g","tester",50000,"Bangalore"));
		//emp.add(new Employee(1,"h","tester",50000,"Bangalore"));
		
		System.out.println(emp);
		System.out.println("=============================");
		emp.stream().forEach(getData->System.out.println(getData));
		System.out.println("=============================");
		
		List<Employee> EmployeeFilter=emp.stream().filter(getData->getData.getSal()>45000 && getData.getName().contains("a")).collect(Collectors.toList());
		List<Employee> empsortASC=emp.stream().sorted(Comparator.comparingInt(employee->employee.))
        EmployeeFilter.forEach(e->System.out.println(e));
	}

}
