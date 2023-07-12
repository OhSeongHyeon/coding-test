import java.util.*;

class Solution {
    public List<Integer> solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
        	if(i%5 != 0) {
        		continue;
        	}
        	boolean isConfirm = true;
			char[] ca = String.valueOf(i).toCharArray();
			for (int j = 0; j < ca.length; j++) {
				if(ca[j] != '0' && ca[j] != '5') {
					isConfirm = false;
					break;
				}
			}
			if(isConfirm) {
				list.add(i);
			}
		}
        if(list.size() == 0) {
        	list.add(-1);
        }
        return list;
    }
}