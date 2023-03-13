import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        answer = new int[2];
        
        int max=0;
        int count=0;
        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max=array[i];
                count=i;
            }
        }
        
        answer[0] = max;
        answer[1] = count;
        
        return answer;
    }
}