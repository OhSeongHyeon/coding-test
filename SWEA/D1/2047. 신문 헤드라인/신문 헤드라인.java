import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
		){
        	bw.write(br.readLine().toUpperCase());
        	bw.flush();
        }catch(Exception e) {
        	e.printStackTrace();
        }
    }
}