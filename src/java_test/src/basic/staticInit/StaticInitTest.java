package basic.staticInit;

public class StaticInitTest {
	static int count = 2; // 定义静态变量（类变量）count，这个不是比较对象，下面的name是

	static String name = "我的黑马之路"; // 定义静态变量

	static { // 通过静态初始化块为name变量初始化
		System.out.println("StaticInitTest的静态初始化块！");
		name = "黑马编程";
	}

	// static String name = "我的黑马之路"; // 定义静态变量
	// static String name; // 定义静态变量

	public static void main(String[] args) {
		System.out.println("count的值：" + StaticInitTest.count);
		System.out.println("name的值：" + StaticInitTest.name);
	}
}
