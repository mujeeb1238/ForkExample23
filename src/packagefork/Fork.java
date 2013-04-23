package packagefork;

public class Fork {
	static int x;
	static int y;
	public static void sum(){
		x=10;
		y=20;
		int z=x+y;
		System.out.println(z);
	}
	public static void sub(){
	x=15;
	y=14;
	int z=x-y;
	System.out.println(z);
System.out.println(hai);
	}
	public static void main(String a[]){
		sum();
                sub();
		System.out.println("Hello hai how r u");
		System.out.println(mul(12,33));
	}
	
	/*
		this method is added by rahman
	*/
	public static int mul(int a, int b){
		return a*b;
	}
	

}
