import java.util.*;

class Solution {
    
    private static Map<String, Integer> MENU = new HashMap<>();
	
	static {
		MENU.put("iceamericano", 4500);
		MENU.put("americanoice", 4500);
		MENU.put("hotamericano", 4500);
		MENU.put("americanohot", 4500);
		MENU.put("icecafelatte", 5000);
		MENU.put("cafelatteice", 5000);
		MENU.put("hotcafelatte", 5000);
		MENU.put("cafelattehot", 5000);
		MENU.put("americano", 4500);
		MENU.put("cafelatte", 5000);
		MENU.put("anything", 4500);
	}
	
	public int solution(String[] order) {
        int answer = 0;
        
        for (String str : order) {
			answer += MENU.get(str);
		}
        
        return answer;
    }
}