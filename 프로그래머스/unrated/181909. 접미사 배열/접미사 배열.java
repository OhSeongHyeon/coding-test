import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] strArr = new String[len];
        for (int i = 0; i < len; i++) {
			strArr[i] = my_string.substring(i, len);
		}
        Arrays.sort(strArr);
        return strArr;
    }
}