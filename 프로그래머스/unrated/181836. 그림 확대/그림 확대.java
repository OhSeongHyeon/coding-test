class Solution {
    public String[] solution(String[] picture, int k) {
		int pLen = picture.length;
		String[] usp = new String[pLen*k];
		int idx = 0;
        
		for (int i = 0; i < pLen; i++) {
			String line = picture[i];
			int ll = line.length();
			char[] ca = new char[ll*k];
			int caIdx = 0;
			
			for (int j = 0; j < ll; j++) {
				for (int j2 = 0; j2 < k; j2++) {
					ca[caIdx++] = line.charAt(j);
				}
			}
			
			for (int j = 0; j < k; j++) {
				usp[idx++] = String.valueOf(ca);
			}
		}
        
        return usp;
    }
}