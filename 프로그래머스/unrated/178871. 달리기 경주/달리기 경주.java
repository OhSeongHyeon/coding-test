import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> rankBoard = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
        	rankBoard.put(players[i], i);
		}
        
        for (String c : callings) {
        	int rank = rankBoard.get(c);
        	String tmp = players[rank-1];
        	players[rank-1] = players[rank];
        	players[rank] = tmp;
        	
        	rankBoard.put(c, rankBoard.get(c)-1);
        	rankBoard.put(tmp, rankBoard.get(tmp)+1);
		}
        
        return players;
    }
}