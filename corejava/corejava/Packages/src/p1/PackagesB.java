package p1;
import static p1.PackagesA..*;
import AccessModifierspackagesp1.A;
import p1.p3.E;

public class PackagesB {

	public static void main(String[] args) {
		
		a1();
		
		A aObject = new A();
		aObject.a2();
		
		E eObject = new E();
		eObject.e1();

	}

}
