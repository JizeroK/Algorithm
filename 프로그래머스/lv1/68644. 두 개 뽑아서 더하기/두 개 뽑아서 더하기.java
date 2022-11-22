import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int sum = 0;
        ArrayList<Integer> list=new ArrayList<Integer>();
            
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                sum=numbers[i]+numbers[j];
                if(!list.contains(sum))
                    list.add(sum);
            }
        }
        
        answer=new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
