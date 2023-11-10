class Solution {
    public String solution(String polynomial) {
		StringBuilder sb = new StringBuilder();
        int var = 0, con = 0;
        
        for(String s : polynomial.split("\\s\\+\\s")) {
        	if(s.contains("x")) {
        		String ra = s.replaceAll("[^0-9]", "");
        		var += ra.isEmpty() ? 1 : Integer.parseInt(ra);
        	}else {
        		con += Integer.parseInt(s);
        	}
        }
        
        return sb.append(var > 1 ? var : "")
        	.append(var > 0 ? "x" : "")
        	.append(con > 0 && var > 0 ? " + " : "")
        	.append(con > 0 ? con : "")
        	.toString();
    }
}