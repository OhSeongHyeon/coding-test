class Solution {
	public int solution(int n, String control) {
        int len = control.length();
        for(int i=0; i<len; i++){
            char c = control.charAt(i);
            switch(c){
                case 'w': n += 1;
                	break;
                case 's': n -= 1;
                	break;
                case 'd': n += 10;
                	break;
                case 'a': n -= 10;
                	break;
            }
        }
        return n;
    }
}