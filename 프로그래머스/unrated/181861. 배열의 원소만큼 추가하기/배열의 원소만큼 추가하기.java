class Solution {
    public int[] solution(int[] arr) {
		int len = 0;
		
        for (int n : arr) { 
        	len += n;
        }
        
        int[] res = new int[len];
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				res[idx++] = arr[i];
			}
		}
        
        return res;
    }
}