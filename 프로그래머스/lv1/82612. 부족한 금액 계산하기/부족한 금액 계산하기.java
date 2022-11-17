class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum=0;
        
        sum=(long)price*(((count+1)*count)/2);
        answer=money-sum;
        
        if(answer<0) answer=-answer;
        else answer=0;
        
        return answer;
    }
}