import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			int n = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				String inp = br.readLine();
				String yyyy = inp.substring(0, 4);
				String mm = inp.substring(4, 6);
				String dd = inp.substring(6, 8);
				//int y = Integer.parseInt(yyyy);
				int m = Integer.parseInt(mm);
				int d = Integer.parseInt(dd);
				
				sb.append(String.format("#%d ", i+1));
				
				if( !(0<m && m<=12) ) {
					sb.append("-1").append("\n");
					continue;
				}
				
				// 한달 31: 1, 3, 5, 7, 8, 10, 12
				if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
					if( !(1<=d && d<=31) ) {
						sb.append("-1").append("\n");
						continue;
					}
				}
				// 한달31: 4, 6, 9, 11
				else if(m==4 || m==6 || m==9 || m==11) {
					if( !(1<=d && d<=30) ) {
						sb.append("-1").append("\n");
						continue;
					}
				}
				// 2월
				else {
					if( !(1<=d && d<=28) ) {
						sb.append("-1").append("\n");
						continue;
					}
				}
				
				sb.append(yyyy)
					.append("/")
					.append(mm)
					.append("/")
					.append(dd)
					.append("\n");
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

}