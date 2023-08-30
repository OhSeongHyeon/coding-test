class Solution {
    public String[] solution(String myStr) {
        String str = myStr.replaceAll("[a-c]+", " ").trim();
        return "".equals(str) ? new String[] {"EMPTY"} : str.split("\\s");
    }
}