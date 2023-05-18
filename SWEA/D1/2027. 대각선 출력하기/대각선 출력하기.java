import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		try(
			//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:/input.txt"))); // 텍스트 파일 읽고 싶을떄
			//BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:/input.txt")));
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < 5; i++) {
				char[] chars = "+++++".toCharArray();
				chars[i] = '#';
				sb.append(chars).append("\n");
			}
			
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

}