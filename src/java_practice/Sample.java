package java_practice;

public class Sample {
	public static void test(int... num) {
		System.out.println(num[1]);
	}

	public static void main(String[] args) {
		test(1,2,3);
	}

}


