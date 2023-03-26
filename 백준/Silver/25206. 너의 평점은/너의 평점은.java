import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
	public static void main(String[] args) {
    	try(
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		){
    		Map<String, Double> gradeTable = new HashMap<>();
    		int[] gApbUpc = IntStream.rangeClosed(65, 68).toArray();
    		char[] suffix = {'+', '0'};
    		double ratingTemp = 5.0;
    		
    		for (int i = 0; i < gApbUpc.length; i++) {
				for (int j = 0; j < suffix.length; j++) {
					StringBuilder sb = new StringBuilder();
					sb.append((char) gApbUpc[i]).append(suffix[j]);
					gradeTable.put(sb.toString(), ratingTemp -= 0.5);
				}
			}
    		gradeTable.put("F", 0.0);
    		
    		double acc = 0;
    		double creditTotal = 0;
    		int subjectNum = 20;
    		while( subjectNum-- > 0 ) {
    			String[] rl = br.readLine().split(" ");
    			double inputCredit = Double.parseDouble(rl[1]);
    			String inputGrade = rl[2];
    			if( "P".equals(inputGrade) ) {
    				continue;
    			}
    			double rating = gradeTable.get(inputGrade);
    			acc += inputCredit * rating;
    			creditTotal += inputCredit;
    		}
    		
    		double gpa = acc / creditTotal;
    		
    		bw.write(String.valueOf(gpa));
    		bw.flush();
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    }
}