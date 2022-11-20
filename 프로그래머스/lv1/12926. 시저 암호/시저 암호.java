import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] chr = s.toCharArray();
        
        for(int i=0; i<chr.length; i++){
            if(chr[i]==' ') {
                answer+=chr[i];
                continue;
            }
            if(Character.isUpperCase(chr[i])){
                if(chr[i]+n>90) {
                    chr[i]=(char)(chr[i]+n-26);
                }
                else {
                    chr[i]=(char)(chr[i]+n);
                }
            }
            else{
                if(chr[i]+n>122) {
                    chr[i]=(char)(chr[i]+n-26);
                }
                else {
                    chr[i]=(char)(chr[i]+n);
                }
            }
            answer+=chr[i];
        }
        
        return answer;
    }
}