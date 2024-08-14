package expdemo;

import java.io.FileReader;
import java.io.FileWriter;

public class Manager6 {

	
public void fileRead(){
	System.out.println("from method");
	
	try {
		Thread.sleep(5000);
		FileReader fr=new FileReader("xam.txt");
		int i=fr.read();
		System.out.println(i);
	}
	catch(Exception e) {
		
	}
	
	
	
	
	
	
	
	
	System.out.println("Done");
}

public static void main(String[] args){
	// TODO Auto-generated method stub
	System.out.println(1);
	Manager6 files=new Manager6();
		files.fileReadIntern();
	}
	public void fileReadIntern() {
		fileRead();
	
		
		

}

}
