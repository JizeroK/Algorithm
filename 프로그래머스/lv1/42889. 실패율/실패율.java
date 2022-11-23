import java.util.*;

class Solution {
      public static int[] solution(int N, int[] stages) { //2, {1}
        int[] answer = {};
        answer = new int[N];
        ArrayList<Integer> plist = new ArrayList<Integer>();
        
        for(int i=0; i<=N; i++){  //(스테이지 당 머무는 사람) 
        	plist.add(i, 0);
        }
        
        for(int i=0; i<stages.length; i++){  
            if(stages[i]>N) continue; 
            plist.set(stages[i], (plist.get(stages[i])+1));
        }
        
        ArrayList<Double> perlist = new ArrayList<Double>(); 
        int people=stages.length;
        for(int i=1; i<plist.size(); i++){
        	if(people==0) perlist.add(0.0);
        	else perlist.add((double)plist.get(i)/people);
            people=people-plist.get(i);
        }
    
        int count=0;
        do{
            int max_i=perlist.size()-1;
            for(int i=perlist.size()-1; i>=0; i--){
                if(perlist.get(max_i)<=perlist.get(i)){
                    max_i=i;
                }
            }
            answer[count]=max_i+1;
            count+=1;
            perlist.set(max_i, -1.0);
        }while(count!=perlist.size());
        
        return answer;
    }
}