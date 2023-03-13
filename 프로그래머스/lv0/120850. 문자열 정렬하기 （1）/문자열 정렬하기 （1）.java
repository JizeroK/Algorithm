import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = {};
        int c=0;
        
        for(int i=0; i<my_string.length(); i++){
            if(48<=my_string.charAt(i) && my_string.charAt(i)<=57){
                c++;
            }
        }
        
        answer = new int[c];
        
        c=0;
        for(int i=0; i<my_string.length(); i++){
            if(48<=my_string.charAt(i) && my_string.charAt(i)<=57){
                answer[c] = my_string.charAt(i)-48;
                c++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}