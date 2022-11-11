class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while(true) {        //1이면 반복문 종료
            if(num==1) break;
            if(num%2==0) {
                num=num/2;
            }
            else if(num%2==1) {  
                num=(num*3)+1; 
            }
            
            answer++;
            
            if(answer==500) { 
                answer=-1;  
                break;
            }
        }
        
        return answer;
    }
}