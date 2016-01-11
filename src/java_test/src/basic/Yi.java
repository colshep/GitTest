package basic;

public class Yi {

	public static void main(String[] args) {
		int i=8;
		System.out.println(i<<2);
		System.out.println(i>>1);
		System.out.println(i>>40);
		
		int j=-8;
		System.out.println(Integer.toBinaryString(j));
		System.out.println(Integer.toBinaryString(j<<2));
//		System.out.println(Integer.toBinaryString(j<<<2)); //不存在<<<运算符
		System.out.println(Integer.toBinaryString(j>>1));
		System.out.println((j>>>1)+","+Integer.toBinaryString(j>>>1));
	}
}
