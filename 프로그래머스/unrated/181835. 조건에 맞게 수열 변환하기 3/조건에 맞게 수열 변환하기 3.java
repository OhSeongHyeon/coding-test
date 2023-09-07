class Solution {
    public int[] solution(int[] arr, int k) {
        return k%2==0 ? even(arr, k) : odd(arr, k);
    }
	
	public int[] even(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
			arr[i] += k;
		}
        return arr;
    }
	
	public int[] odd(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
			arr[i] *= k;
		}
        return arr;
    }
}