class Solution {
    public int solution(int[][] dots) {
        int xMin = Integer.MAX_VALUE;
        int xMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        
        for(int[] arr : dots) {
        	xMin = Math.min(xMin, arr[0]);
        	xMax = Math.max(xMax, arr[0]);
        	yMin = Math.min(yMin, arr[1]);
        	yMax = Math.max(yMax, arr[1]);
        }
        
        return (xMax-xMin) * (yMax-yMin);
    }
}