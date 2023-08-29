import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        return Arrays.stream(my_string.trim().split("\\s")).filter(s -> !"".equals(s)).toArray(String[]::new);
    }
}