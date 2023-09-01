class Solution {
    public int solution(int[] arr1, int[] arr2) {
		if(arr1.length > arr2.length) {
			return 1;
		}else if(arr1.length < arr2.length) {
			return -1;
		}
		
        int a1Sum = 0;
        int a2Sum = 0;
        
        for (int n1 : arr1) a1Sum += n1;
        for (int n2 : arr2) a2Sum += n2;
        
        return a1Sum == a2Sum ? 0 : a1Sum > a2Sum ? 1 : -1;
    }
}