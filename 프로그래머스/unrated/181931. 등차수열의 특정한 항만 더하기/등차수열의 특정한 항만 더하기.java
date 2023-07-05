class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = a;
        int sum = 0;
        for(int i=0; i<included.length; i++){
            if(included[i]){
                sum += answer;
            }
            answer += d;
        }
        return sum;
    }
}