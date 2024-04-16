package kitasoft1;
import java.io.*;


public class Practice {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] schedule = {{0,1,0,1,1,0,1},{0,1,1,1,1,1,0},{0,1,1,0,1,1,0}};
		
		System.out.println("曜日を入力してください\n"
				+ "0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int day = Integer.parseInt(br.readLine());
		
		System.out.println("時間帯を入力してください\n"
				+ "0=午前、1=午後、2=夜間");
		int time = Integer.parseInt(br.readLine());
		
		if(schedule[time][day] == 0) {
			System.out.println("休診");
		}else {
			System.out.println("開いています");
		}
	}
	
}
