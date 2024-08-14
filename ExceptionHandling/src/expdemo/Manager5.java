package expdemo;

import java.io.FileReader;

public class Manager5 {
	public void fileRead()throws InterruptedException {
		System.out.println("from method");
		Thread.sleep(5000);
		/*try {
			Thread.sleep(5000);
			FileReader fr=new FileReader("demo.txt");
			int i=fr.read();
			System.out.println(i);
		}
		catch(Exception e) {
			
		}*/
		System.out.println("Done");
	}

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.out.println(1);
		Manager5 files=new Manager5();
			files.fileReadIntern();
		}
		public void fileReadIntern()throws InterruptedException {
			fileRead();
		
			
			

	}

}
