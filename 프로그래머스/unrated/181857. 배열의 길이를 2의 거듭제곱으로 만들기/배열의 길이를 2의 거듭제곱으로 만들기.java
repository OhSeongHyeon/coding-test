class Solution {
    public int[] solution(int[] arr) {
        int len = 1;
		while(arr.length > len) {
			len *= 2;
		}
		
		int[] res = new int[len];
		
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}
		
        return res;
    }
}