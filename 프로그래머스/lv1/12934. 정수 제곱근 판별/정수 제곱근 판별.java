
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        double d=Math.sqrt(n);
        int num=(int)d;
        
        if(d==num) answer=(long)Math.pow(num+1,2);
        else answer=-1;
        
        return answer;
    }
}