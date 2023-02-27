import java.util.ArrayList;
import java.util.List;

public class AnnotationsB {

	
	@SuppressWarnings({ "deprecation", "rawtypes" })
	public static void main(String[] args) {
		AnnotationsA a = new AnnotationsA();
		a.myMethod();
		a.myMethod2();
		System.out.println(a);
		
		List list = new ArrayList();
		System.out.println(list);
	}

}
