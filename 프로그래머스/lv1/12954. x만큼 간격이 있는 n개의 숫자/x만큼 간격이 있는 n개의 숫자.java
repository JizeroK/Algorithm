class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer=new long[n]; //n개의 배열 선언
        
        for(int i=0; i<n; i++){
            answer[i]=(i+1)*(long)x;
        }
        
        return answer;
    }
}