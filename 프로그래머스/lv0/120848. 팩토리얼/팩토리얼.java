class Solution {
    public int solution(int n) {
        int answer = 0;
        int tmp=1;
        
        answer=1;
        do{
            tmp=answer*tmp;
            answer++;
        }while(n/tmp!=0);
    
        answer-=2;
        
        return answer;
    }
}