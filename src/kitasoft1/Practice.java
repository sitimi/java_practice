package kitasoft1;

import java.io.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = 0;

		System.err.println("自然数を１０回入力してください");
		for (int i = 1; i <= 10; i++) {
			int x = Integer.parseInt(br.readLine());
			if (num <= x) {
				num = x;
			}
		}
		System.out.println(num);

	}

}
