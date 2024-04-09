package java_practice;

public class Triangle {

	public static void main(String[] args) {
		int height = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		int area;

		area = height * width / 2;

		System.out.println("面積は" + area + "です");

	}

}
