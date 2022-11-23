import java.util.*;

class Solution {
      public static int[] solution(int N, int[] stages) { 
        int[] answer = {};

        answer = new int[N];  //answer은 각 스테이지에 실패확률을 저장하기 때문에 스테이지의 수와 같아야한다.
        ArrayList<Integer> plist = new ArrayList<Integer>(); //각 스테이지에 머무는 사람의 수 리스트
        
				//각 스테이지에 머무는 사람의 수를 저장하기 위해 스테이지 갯수만큼 리스트 생성
        for(int i=0; i<=N; i++){  
	        	plist.add(i, 0);
        }
        
			  //인덱스는 스테이지(i번째 스테이지), 값은 머무는 사람 수(i번째 스테이지에 plist.get(i)명)
				//(0번째 스테이지는 존재X, 따라서 인덱스 0은 쓰이지 않을 예정)
        for(int i=0; i<stages.length; i++){  
            if(stages[i]>N) continue; 
            plist.set(stages[i], (plist.get(stages[i])+1));
        }
        
				//각 스테이지의 실패율을 저장할 리스트 
        ArrayList<Double> perlist = new ArrayList<Double>(); 
        int people=stages.length;
         
				//실패율 구해서 perlist에 저장
				//(perlist의 인덱스는 해당 스테이지와 -1 차이) ex) 스테이지2의 실패율은 perlist[1]에 저장
        for(int i=1; i<plist.size(); i++){  //(0번째 스테이지는 존재X, 따라서 인덱스 1부터)
        	if(people==0) perlist.add(0.0);   //만약 사람의 수가 0이면 그 뒤에 나오는 스테이지의 실패율은 다 0으로 저장.
        	else perlist.add((double)plist.get(i)/people);  //사람의 수가 존재하면 실패율이 존재한다는 뜻이므로 실패율을 구해서 값 저장
            people=people-plist.get(i);
        }
    
				//count는 answer인덱스
        int count=0;
        do{
            int max_i=perlist.size()-1;  //최대 확률 인덱스를 마지막 확률로 초기화
            for(int i=perlist.size()-1; i>=0; i--){  //마지막부터 최대값 찾기(같은 확률이면 오름차순을 하기 위해서)
                if(perlist.get(max_i)<=perlist.get(i)){ //최대값 갱신 조건문
                    max_i=i;
                }
            }
						//최대값 인덱스가 구해지면 차례대로 answer에 저장
						//+1을 하는 이유 : perlist의 인덱스는 해당 스테이지와 -1 차이가 나기 때문
            answer[count]=max_i+1;  
            count+=1; //다음에 저장할 answer배열 인덱스 증가
            perlist.set(max_i, -1.0);  //최대값이었던 인덱스의 값을 0보다 작은수로 해서 최대값 찾기에 제외되게 한다.
        }while(count!=perlist.size());  //만약 answer의 배열이 perlist에 모든 값을 저장했다면 반복문을 빠져나간다.
        
        return answer;
    }
}