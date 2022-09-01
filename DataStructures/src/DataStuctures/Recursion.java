package DataStuctures;

public class Recursion {
	public static void PrintName(int n) {
		if(n<=0) {return;}
		System.out.println("hello");
		PrintName(n-1);
	}
	public static void main(String[] args) {
		PrintName(10);
	}

}
