class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(a!=b && b!=c && a!=c){
            answer = a+b+c;
        }else if((a==b&&b!=c) || (b==c&&a!=b) || (a==c&&b!=c)){
            answer = (a+b+c)*(a*a+b*b+c*c);
        }else if(a==b&&b==c&&a==c){
            answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);
        }
        return answer;
    }
}