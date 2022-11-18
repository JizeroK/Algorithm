class Solution {
    public int gcd(int a, int b){
        if(a%b==0) return b;
        else return gcd(b,a%b);
    }
    
    public int[] solution(int n, int m) {
        int[] answer = {};
        answer=new int[2];
        
        if(n>=m) answer[0]=gcd(n,m);
        else answer[0]=gcd(m,n);
        
        answer[1]=n*m/answer[0];
        
        return answer;
    }
}