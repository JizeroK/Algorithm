import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; 
        int nonlost_count=0;

        /*ArrayList<Integer> lostList = new ArrayList<Integer>();
        ArrayList<Integer> reserveList = new ArrayList<Integer>();
        ArrayList<Integer> noreserve = new ArrayList<Integer>();*/

        Arrays.sort(lost);  //문제에 정렬됐다는 조건이 없다.
        Arrays.sort(reserve);
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){  //빌려온애가 잃어버리면
                    lost[i]=-1;
                    reserve[j]=-1;  //빌리지도 빌려주지도 못하게 만든다.
                    nonlost_count++;  //잃어버린 배열 포함되어 있지만 빌리지 않아도 되는 수 
                }
            }
        }
                   
        answer=n-lost.length+nonlost_count++;
        //System.out.println(answer);

        /*for(int l: lost){
            lostList.add(l);
        }
        for(int r: reserve){
            reserveList.add(r);
        }

        for(int i=0; i<lostList.size(); i++){
            for(int j=0; j<reserveList.size(); j++){
                if(lostList.get(i)==reserveList.get(j))
                    noreserve.add(lostList.get(i));
            }
        }

        for(int i=0; i<noreserve.size(); i++){
            lostList.remove(noreserve.get(i));
            reserveList.remove(noreserve.get(i));
        }

        answer=n-lostList.size();*/

        /*int start=0;
        for(int i=0; i<lostList.size(); i++){
            for(int j=start; j<reserveList.size(); j++){
                if(reserveList.get(j)==lostList.get(i)-1||reserveList.get(j)==lostList.get(i)+1){
                    answer+=1;  //reserve j번째 학생이 i번째 학생에게 빌려줌
                    System.out.println(reserveList.get(j)+", "+lostList.get(i));
                    start=j+1;  //빌려준 학생 제외
                    break;
                }
            }
            if(start==reserveList.size()) break;
        }*/
        
        int start=0;
        for(int i=0; i<lost.length; i++){
            for(int j=start; j<reserve.length; j++){
                if(reserve[j]==-1) continue;
                if(reserve[j]==lost[i]-1||reserve[j]==lost[i]+1){
                    answer+=1;  //reserve j번째 학생이 i번째 학생에게 빌려줌
                    start=j+1;  //빌려준 학생 제외
                    break;
                }
            }
            if(start==reserve.length) break;
        }

        return answer;
    }
}