package java_practice;

public class Training {
	public static void main(String[] args) {
		loop1: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("" + i + j);
				if (i == 1 && j == 0) {
					break;
				}
			}
		}
	}
}
