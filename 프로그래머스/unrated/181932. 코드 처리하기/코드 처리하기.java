class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int len = code.length();
        boolean mode = true; // t: 짝, f: 홀
        
        for(int i=0; i<len; i++){
            char c = code.charAt(i);
            if(c == '1'){
                mode = !mode;
                continue;
            }
            
            if(mode && i%2 == 0){
                sb.append(c);
            }else if(!mode && i%2 != 0){
                sb.append(c);
            }
        }
        
        return sb.toString().isEmpty() ? "EMPTY" : sb.toString();
    }
}