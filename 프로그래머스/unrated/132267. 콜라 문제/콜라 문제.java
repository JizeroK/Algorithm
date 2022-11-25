class Solution {
    public int solution(int a, int b, int n) {  
        int answer = 0;
        int give_n=0;
        int change_n=0;
        
        while(n>=a){
            give_n=n-(n%a);  
            change_n=(give_n/a)*b;
            answer=answer+change_n; 
            n=n-give_n+change_n; 
        }
        
        return answer;
    }
}
