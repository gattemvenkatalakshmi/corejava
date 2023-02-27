import java.util.Arrays;


public class AnnotationTest2 {

	public static void main(String[] args) {
		try {
			System.out.println(Arrays.toString(Class.forName(AnnotationsA.class.getName()).getConstructors()));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
