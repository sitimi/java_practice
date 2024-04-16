package kitasoft1;
import java.io.*;

public class Practice2_3  {
    public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );

        int  x = Integer.parseInt(br.readLine());    // 1行分の文字列を入力する
        System.out.println(x);
        System.out.println(x * x);
        System.out.println(x * x * x);
    }
}