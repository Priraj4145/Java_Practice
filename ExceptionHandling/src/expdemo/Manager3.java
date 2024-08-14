package expdemo;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Manager3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(1);
try {
Connection con=DriverManager.getConnection("");
}
catch(SQLException e) {
	System.out.println(e);
}
System.out.println(2);
System.out.println("Done");
FileWriter fw;
try {
	fw=new FileWriter("demo.txt");
	fw.write("I am from java");
	fw.flush();
}
catch(IOException e) {
	e.printStackTrace();
}
	}

}
