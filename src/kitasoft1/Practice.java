package kitasoft1;

import java.io.*;

public class Practice {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		int[] nums = new int[10];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			
		}
		for (int i = 9; i >= 0; i--) {
			System.out.println(nums[i] );
		}

	}

}
