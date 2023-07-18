class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] dice = new int[7];
        dice[a]++;
        dice[b]++;
        dice[c]++;
        dice[d]++;
        if(a!=b && a!=c && a!=d && b!=c && b!=d & c!=d) {
        	for (int i = 1; i <= 6; i++) {
    			if(dice[i] == 1) {
    				return i;
    			}
    		}
        }
        for (int p = 1; p <= 6; p++) {
        	if(dice[p] == 0) {
        		continue;
        	}
			if(dice[p] == 4) {
				answer = p * 1111;
				break;
			}else if(dice[p] == 3) {
				for (int q = 1; q <= 6; q++) {
		        	if(dice[q] == 0) {
		        		continue;
		        	}
					if(dice[q] == 1) {
						answer = (10 * p + q) * (10 * p + q);
						break;
					}
				}
				break;
			}else if(dice[p] == 2) {
				for (int q = 1; q <= 6; q++) {
		        	if(dice[q] == 0) {
		        		continue;
		        	}
					if(dice[q] == 2 && p != q) {
						answer = (q+p) * Math.abs(p-q);
						break;
					}else if(dice[q] == 1) {
						for (int r = 1; r <= 6; r++) {
				        	if(dice[r] == 0) {
				        		continue;
				        	}
							if(dice[r] == 1 && q != r) {
								answer = q * r;
								break;
							}
						}
						break;
					}
				}
				break;
			}
		}
        return answer;
    }
}