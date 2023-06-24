class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s1 = String.valueOf(a) + String.valueOf(b);
        String s2 = String.valueOf(b) + String.valueOf(a);
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        return answer = i1 >= i2 ? i1 : i2;
    }
}