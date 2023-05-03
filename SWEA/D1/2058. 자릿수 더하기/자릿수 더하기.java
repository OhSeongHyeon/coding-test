import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			char[] inp = br.readLine().toCharArray();
			int sum = 0;
			for (int i = 0; i < inp.length; i++) {
				sum += inp[i] - '0';
			}
			bw.write(String.valueOf(sum));
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

}