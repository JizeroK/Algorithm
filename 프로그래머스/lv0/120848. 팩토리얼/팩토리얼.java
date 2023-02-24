class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp=1;
        
        answer=1;
        do{
            tmp=answer*tmp;
            if(n/tmp!=0){
                answer++;
            }
        }while(n/tmp!=0);
    
        answer-=1;
        
        return answer;
    }
}