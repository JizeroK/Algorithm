class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] cnt = new int[n+2]; //에라토스테네스의 체
        
        for(int i=2; i<=n; i++){
            cnt[i]=i;
        }
        
        for(int i=2; i<=n; i++){
            if(cnt[i]==0) continue;
            for(int j=2*i; j<=n; j+=i){  //배수 지우기
                cnt[j]=0;
            }
        }
        
        for(int i=2;i<=n;i++) {
            if(cnt[i]!=0) answer+=1;
        }
        return answer;
    }
}