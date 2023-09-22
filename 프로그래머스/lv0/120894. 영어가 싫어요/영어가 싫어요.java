import java.util.*;

class Solution {
    
    private static String[] STR_NUMBERS = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	private static Map<String, String> NUMBER_TABLE = new HashMap<>();
    
	static {
		for (int i = 0; i < STR_NUMBERS.length; i++) {
			NUMBER_TABLE.put(STR_NUMBERS[i], String.valueOf(i));
		}
	}
    
	public long solution(String numbers) {
		int len = numbers.length();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = 3;
        
        while (true) {
        	String str = numbers.substring(start, end++);
        	
        	if(NUMBER_TABLE.containsKey(str)) {
        		sb.append(NUMBER_TABLE.get(str));
        		start = end - 1;
        		end = start + 3;
        	}
        	
        	if(end > len) {
        		break;
        	}
		}
        
        return Long.parseLong(sb.toString());
    }
}