class Solution {
    public int[] solution(int s, int e) {
        int[] a = new int[e-s+1];
        for(int n=s, i=0; n<=e; n++, i++){
            a[i] = n;
        }
        return a;
    }
}