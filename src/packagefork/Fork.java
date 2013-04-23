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
	public static void main(String a[]){
		sum();
		System.out.println("Hello hai how r u");
	}

}
