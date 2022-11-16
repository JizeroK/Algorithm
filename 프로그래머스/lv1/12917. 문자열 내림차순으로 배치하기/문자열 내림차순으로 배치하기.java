import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str=new String[s.length()];
        str=s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        answer=String.join("", str);
        
        return answer;
    }
}