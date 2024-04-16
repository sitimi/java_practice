package kitasoft1;
import java.io.*;

public class Practice2_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		
		int x = Integer.parseInt( br.readLine() );
		int y = Integer.parseInt( br.readLine() );
		System.out.println((x + y) / 2);

	}

}
