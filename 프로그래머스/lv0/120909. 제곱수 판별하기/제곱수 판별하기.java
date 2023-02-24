class Solution {
    public int solution(int n) {
        int answer = 0;
        
        Double tmp=Math.sqrt(n);
        
        if(tmp==tmp.intValue()){
            answer=1;
        }else{
            answer=2;
        }
        
        return answer;
    }
}