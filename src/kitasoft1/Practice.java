package kitasoft1;

import java.io.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 2;

		int num = Integer.parseInt(br.readLine());

		while (num > 1) {
			while (num % i == 0) {
				System.out.print(i + " ");
				num /= i;

			}
			i++;
		}
	}

}
