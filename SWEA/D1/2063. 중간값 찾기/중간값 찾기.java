import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		try(
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ){
			int c = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			int[] arr = new int[c];
			String[] inp = br.readLine().split(" ");
			for (int j = 0; j < inp.length; j++) {
				arr[j] = Integer.parseInt(inp[j]);
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						int tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			sb.append(arr[c/2]);
			bw.write(sb.toString());
            bw.flush();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
	}

}