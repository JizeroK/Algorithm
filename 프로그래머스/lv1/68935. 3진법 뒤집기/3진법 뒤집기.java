class Solution {
    public int solution(int n) {
        int answer = 0;
        String tmp="";
        
        while(n!=0){
            tmp=tmp+n%3; //앞뒤반전
            n=n/3;
        } //3진법변환
       
        answer=Integer.parseInt(tmp,3);
        
        return answer;
    }
}