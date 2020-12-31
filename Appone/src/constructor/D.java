package constructor;

public class D {
	
	D(){
		this(100,200);
		System.out.println("welcome");
		
	}
	
	
	
	D(int i,int j){
		
		System.out.println(i);
		System.out.println(j);
		
	}
	public void test1(){
		
		
	}
	
	public static void main(String[] args) {
		D a=new D();
		//A a1=new A(100,200);
		
		
	}

}
