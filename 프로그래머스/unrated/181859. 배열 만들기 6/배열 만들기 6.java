import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> stk = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
        	if(stk.size() == 0 || (stk.size() > 0 && stk.get(stk.size()-1) != arr[i])) {
        		stk.add(arr[i]);
        	}else if(stk.size() > 0 && stk.get(stk.size()-1) == arr[i]) {
        		stk.remove(stk.size()-1);
        	}
		}
        
        return stk.size() == 0 ? new int[] {-1} : stk.stream().mapToInt(i->i).toArray();
    }
}