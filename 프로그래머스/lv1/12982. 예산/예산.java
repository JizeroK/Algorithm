import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum=0;
        
        Arrays.sort(d);
        while(answer!=d.length){
            sum+=d[answer];
            if(sum>budget)
                break;
            answer++;
        }
        
        return answer;
    }
}