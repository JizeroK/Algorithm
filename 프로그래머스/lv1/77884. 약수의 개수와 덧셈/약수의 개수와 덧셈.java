class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){  
            if(i%Math.sqrt(i)==0)  //제곱근이 존재한다면 (약수의 갯수는 홀수)
                answer-=i;
            else
                answer+=i;
        }
        
        return answer;
    }
}