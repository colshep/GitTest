package basic;

public class OverloadingVarargs2 {

	static void f(float i, Character... args) {
		System.out.println(i);
	}

//	static void f(Character... args) {
//		System.out.print("second");
//	}

	public static void main(String[] args) {
//		f(1, 'a');
		f('a', 'b');
	}
}
