class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i+1<numLog.length; i++){
            int a = numLog[i];
            int b = numLog[i+1];
            
            if(a+1==b){
                sb.append("w");
            }else if(a-1==b){
                sb.append("s");
            }else if(a+10==b){
                sb.append("d");
            }else if(a-10==b){
                sb.append("a");
            }
        }
        
        return sb.toString();
    }
}