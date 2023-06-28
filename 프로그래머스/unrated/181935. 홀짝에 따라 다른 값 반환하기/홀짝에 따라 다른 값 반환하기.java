class Solution {
    public int solution(int n) {
        return n%2==0 ? evenSqrSum(n) : oddSum(n);
    }
    
    private int evenSqrSum(int n){
        int sum = 0;
        
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                continue;
            }
            
            sum += i*i;
        }
        
        return sum;
    }
    
    private int oddSum(int n){
        int sum = 0;
        
        for(int i=1; i<=n; i++){
            if(i%2==0){
                continue;
            }
            
            sum += i;
        }
        
        return sum;
    }
}