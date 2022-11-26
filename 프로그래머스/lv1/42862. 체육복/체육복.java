import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; 
        
        ArrayList<Integer> lostList = new ArrayList<Integer>();
        ArrayList<Integer> reserveList = new ArrayList<Integer>();
        ArrayList<Integer> noreserve = new ArrayList<Integer>();
        
        Arrays.sort(lost);  //문제에 정렬됐다는 조건이 없다.
        Arrays.sort(reserve);
        
        for(int l: lost){
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
        
        answer=n-lostList.size();

        int start=0;
        for(int i=0; i<lostList.size(); i++){
            for(int j=start; j<reserveList.size(); j++){
                if(reserveList.get(j)==lostList.get(i)-1||reserveList.get(j)==lostList.get(i)+1){
                    answer+=1;  //reserve i 번째 학생이 j번째 학생에게 빌려줌
                    System.out.println(reserveList.get(j)+", "+lostList.get(i));
                    start=j+1;
                    break;
                }
            }
        }
        
        return answer;
    }
}
