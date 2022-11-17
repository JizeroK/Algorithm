class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum=0;
        long sub=0;
        
        sum=(long)price*(((count+1)*count)/2);
        sub=money-sum;
        
        if(sub<0) answer=-sub;
        
        return answer;
    }
}