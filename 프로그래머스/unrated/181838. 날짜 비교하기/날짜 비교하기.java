class Solution {
    public int solution(int[] date1, int[] date2) {
        int s1 = date1[0]*12*30 + date1[1]*30 + date1[2];
        int s2 = date2[0]*12*30 + date2[1]*30 + date2[2];
        return s1 < s2 ? 1 : 0;
    }
}