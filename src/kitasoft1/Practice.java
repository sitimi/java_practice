package kitasoft1;

import java.io.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int num = 1;
		int count = 0;

		while (num != 0) {
			num = Integer.parseInt(br.readLine());
			sum += num;
			count++;
		}
		
		System.out.println(sum / (count - 1));

	}
}
