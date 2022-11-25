import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int num=0;
        int c=0;
        
        char[] score = new char[dartResult.length()];
        int[] scorenum=new int[3]; //점수 저장할 배열
        
        for(int i=0; i<dartResult.length(); i++) {
        	score[i]= dartResult.charAt(i);
        }
        
        for(int i=0; i<score.length; i++){
            if('0'<=score[i] && score[i]<='9') {  //숫자일때
                if(score[i]=='1' && score[i+1]=='0') {//다음 배열에 0이 있으면 10
                    num=10;
                    i++;
                    continue;
                }
                else // 0~9
                    num=(int)score[i]-48;
            }
            
            else if(score[i]=='S' || score[i]=='D' || score[i]=='T') {
                if(score[i]=='S'){
                    num=(int)(Math.pow(num, 1));
                }
                else if(score[i]=='D'){
                    num=(int)(Math.pow(num, 2));
                }
                else if(score[i]=='T'){
                    num=(int)(Math.pow(num, 3));
                } 
                
                if(i!=score.length-1 && (score[i+1]=='*' || score[i+1]=='#')){
                    if(score[i+1]=='#') {
                        num=-num;
                    }
                    else if(score[i+1]=='*'){
                        if(c==0) //아직 저장된 점수 배열이 없을때
                            num=num*2;
                        else{
                            num=num*2;
                            scorenum[c-1]=scorenum[c-1]*2;
                        }
                    }
                    
                    i++;
                }
                
                scorenum[c]=num;
                c++;
            }
        }
        
        for(int i=0; i<scorenum.length; i++){
            answer+=scorenum[i];
        }
        
        return answer;
    }
}