package zlixo;

import xlixo1.Morango1;

public class TesteFruta {
	
	public void fru(int y) {
		int x=++y;
		System.out.println(x);
		
	}
	public TesteFruta(TesteFruta a) {
		b=a;
	}
	static {
		System.out.println("ffff");
	}
	TesteFruta b;
	
	public TesteFruta() {
		
	}
	int quantidade=6;
	

		
	
	public static void main(String[] args) {
		TesteFruta c=new TesteFruta();
		TesteFruta d=new TesteFruta(c);
		TesteFruta e = d.b;
		TesteFruta f = c;
		
	//	d.frutas();
	//	e.frutas();
	//	f.frutas();
		
	//	new TesteFruta().frutas(quantidade);
	//	System.out.println("" + quantidade );
		
		int i=42;
		String a = (i<40)? " life" : (i>50)? "universe": "iii";
		System.out.println(a);
		
		 float[][] f1 = {{1.0f,10.2f},{1.3f,1.2f},{1.4f}};
		

		


	
	
	
	
	 
	}
   	 
	
	
	
}	
	
	
    


