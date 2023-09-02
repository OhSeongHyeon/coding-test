class Solution {
    public int[] solution(int[] arr, int n) {
        return arr = arr.length%2 == 0 ? proc(arr, n, 1) : proc(arr, n, 0);
    }
	
	private int[] proc(int[] arr, int n, int st) {
		for (int i = st; i < arr.length; i+=2) {
    		arr[i] += n;
		}
		return arr;
	}
}