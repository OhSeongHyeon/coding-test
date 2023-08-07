class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        int len = arr.length;
        int s = 0;
        int l = len-1;
        boolean isFind = false;
        
        for (int i = 0; i < len; i++) {
			if(arr[i] == 2) {
				isFind = true;
				s = i;
				break;
			}
		}
        
        if(isFind) {
        	for (int i = len-1; i >= s; i--) {
				if(arr[i] == 2) {
					l = i;
					break;
				}
			}
        	
        	int[] r = new int[l - s + 1];
        	
        	for (int i = s, j = 0; i <= l; i++, j++) {
				r[j] = arr[i];
			}
        	
        	return r;
        }
        
        return answer;
    }
}