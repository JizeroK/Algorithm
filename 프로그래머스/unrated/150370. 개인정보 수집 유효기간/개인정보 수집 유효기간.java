import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        int[] answer = {};
        HashMap<String, String> termsMap = new HashMap<String, String>();
        List<Integer> answerList = new ArrayList<>();
        
        String[] tmp = today.split("\\.");   //현재 날짜 년,월,일로 나누기
        int[] todayArr = new int[tmp.length];
        int[] tmpArr = new int[tmp.length];
        for(int i=0; i<tmp.length; i++){
            todayArr[i]=Integer.parseInt(tmp[i]);
            tmpArr[i]=Integer.parseInt(tmp[i]);
        }
        
        for(int i=0; i<terms.length; i++){
            String[] termsArr = terms[i].split(" ");
            termsMap.put(termsArr[0],termsArr[1]);    // 약관종류에 따른 유효기간
        }
        
        for(int i=0; i<privacies.length; i++){
            String[] privaciesArr = privacies[i].split(" ");
            tmp = privaciesArr[0].split("\\.");
            int[] todayPrivacies = new int[tmp.length];
            for(int j=0; j<tmp.length; j++){
                todayPrivacies[j]=Integer.parseInt(tmp[j]);
            }
            
            int[] result = new int[3];
            
            if(tmpArr[2]-todayPrivacies[2] < 0){
                result[2] = tmpArr[2]+28-todayPrivacies[2];
                tmpArr[1]-=1;
            }else{
                result[2] = tmpArr[2]-todayPrivacies[2];
            }
            
            if(tmpArr[1]-todayPrivacies[1] < 0){
                result[1] = tmpArr[1]+12-todayPrivacies[1];
                tmpArr[0]-=1;
            }else{
                result[1] = tmpArr[1]-todayPrivacies[1];
            }
            
            result[0]=tmpArr[0]-todayPrivacies[0];
            
            int res = result[2]+(result[1]*28)+(result[0]*12*28);
            if(res >= Integer.parseInt(termsMap.get(privaciesArr[1]))*28){
                answerList.add(i+1);
            }
            
             for(int n=0; n<tmp.length; n++){
                tmpArr[n]=todayArr[n];
            }
            
        }
        
        answer = new int[answerList.size()];
        for(int a=0; a<answerList.size(); a++){
            answer[a] = answerList.get(a);
        }       
        
        return answer;
    }
}