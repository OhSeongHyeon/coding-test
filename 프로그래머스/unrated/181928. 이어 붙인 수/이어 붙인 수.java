class Solution {
    public int solution(int[] num_list) {
        String str_odd = "";
        String str_even = "";
        for(int i=0; i<num_list.length; i++){
            int num = num_list[i];
            if(num%2!=0){
                str_odd += String.valueOf(num);
            }else{
                str_even += String.valueOf(num);
            }
        }
        return Integer.parseInt(str_odd) + Integer.parseInt(str_even);
    }
}