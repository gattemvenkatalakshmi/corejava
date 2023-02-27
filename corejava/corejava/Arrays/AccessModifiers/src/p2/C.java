package p2;
import p1.PackagesA;

public class C extends PackagesA{
	
	public static void main(String[] args) {
		PackagesA aObject = new PackagesA();
		System.out.println(aObject.d);
		
		C cObject = new C();
		System.out.println(cObject.c);
		System.out.println(cObject.d);
		
	}

}
