class Solution {
    public String solution(int[] food) {
        String answer = "";
        String tmp;
        
        for(int i=1; i<food.length; i++){
            tmp="";
            for(int j=0; j<((food[i]/2)*2); j++){
                tmp=tmp+i;
            }
            
            answer=answer.substring(0, answer.length()/2)+tmp+answer.substring(answer.length()/2,answer.length());
        }
        
        answer=answer.substring(0, answer.length()/2)+0+answer.substring(answer.length()/2,answer.length());

        return answer;
    }
}