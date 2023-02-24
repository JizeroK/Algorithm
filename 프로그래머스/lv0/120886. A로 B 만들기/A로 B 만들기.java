import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] ch1 = before.toCharArray();
        char[] ch2 = after.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        if(Arrays.equals(ch1, ch2)){
            answer=1;
        }
        
        return answer;
    }
}