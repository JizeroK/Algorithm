class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int c=1;
        int lcm=0;
        while(true){
            if((n*c)%6 == 0){
                lcm = n*c; 
                break;
            }
            c++;            
        }
        
        answer = lcm/6;
        
        return answer;
    }
}