class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
		
        for (String[] data : db) {
        	String dbId = data[0];
        	String dbPw = data[1];
        	
			if(id.equals(dbId) && pw.equals(dbPw)) {
				return "login";
			}
			else if(id.equals(dbId) && !pw.equals(dbPw)) {
				return "wrong pw";
			}
		}
		
        return "fail";
    }
}