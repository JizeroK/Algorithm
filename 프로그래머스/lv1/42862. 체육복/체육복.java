import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; 
        int nonlost_count=0;

        Arrays.sort(lost);  //문제에 정렬됐다는 조건이 없다.
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){  //빌려온애가 잃어버리면
                    lost[i]=-1; //빌리지도 빌려주지도 못하게 만든다
                    reserve[j]=-1;  //빌리지도 빌려주지도 못하게 만든다.
                    nonlost_count++;  //잃어버린 배열 포함되어 있지만 빌리지 않아도 되는 수 
                }
            }
        }
                   
        answer=n-lost.length+nonlost_count++;
        
        int start=0;
        for(int i=0; i<lost.length; i++){
            if(lost[i]==-1) continue;  //안빌려도 되는 학생
            for(int j=start; j<reserve.length; j++){
                if(reserve[j]==-1) continue;  //못빌려주는 학생
                if(reserve[j]==lost[i]-1||reserve[j]==lost[i]+1){
                    answer+=1;  //reserve j번째 학생이 i번째 학생에게 빌려줌
                    start=j+1;  //빌려준 학생 제외해서 for문 돌리기
                    break;
                }
            }
            if(start==reserve.length) break;  //빌려줄 사람이 없으므로 break;
        }

        return answer;
    }
}