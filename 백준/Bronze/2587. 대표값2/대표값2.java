import java.io.*;
import java.util.*;

public class Main {
	// 백준 
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
        	int[] arr = new int[5];
        	int sum = 0;
        	for (int i = 0; i < arr.length; i++) {
        		int n = Integer.parseInt(br.readLine());
				arr[i] = n;
				sum += n;
			}
        	
        	for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
        	
        	bw.write(String.valueOf(sum/5+"\n"));
        	bw.write(String.valueOf(arr[2]));
        	bw.flush();
        }catch(IOException ioe) {
        	ioe.printStackTrace();
        }
    }
}