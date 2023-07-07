class Solution {
    public String solution(String str, int s, int e) {
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        
        for(int i=0; i<s; i++){
            sb.append(str.charAt(i));
        }
        for(int i=e; i>=s; i--){
            sb.append(str.charAt(i));
        }
        for(int i=e+1; i<len; i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}