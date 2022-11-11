import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String tmp=""+n;
        String[] str=tmp.split("");
        
        Arrays.sort(str, Collections.reverseOrder());
        tmp = String.join("", str);
        answer = Long.parseLong(tmp);
        
        return answer;
    }
}