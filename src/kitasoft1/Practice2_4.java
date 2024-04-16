package kitasoft1;

import java.io.*;

public class Practice2_4 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		int x = Integer.parseInt( br.readLine() );
		int y = Integer.parseInt( br.readLine() );
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + x * y);
		System.out.println("x / y = " + x / y + "余り" + x % y);
		
	}

}
