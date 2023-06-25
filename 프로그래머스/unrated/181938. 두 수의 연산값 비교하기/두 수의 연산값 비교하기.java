class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s = String.valueOf(a) + String.valueOf(b);
        int i = Integer.parseInt(s);
        int axbx2 = 2 * a * b;
        return answer = i >= axbx2 ? i : axbx2;
    }
}