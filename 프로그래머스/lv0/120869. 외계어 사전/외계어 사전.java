class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String d : dic) {
        	int dLen = d.length();
			if(dLen != spell.length) continue;
			int cnt = 0;
			
			for (int i = 0; i < spell.length; i++) {
				if(d.indexOf(spell[i]) == -1) break;
				cnt++;
			}
			
			if(cnt == dLen) return 1;
		}
        return 2;
    }
}