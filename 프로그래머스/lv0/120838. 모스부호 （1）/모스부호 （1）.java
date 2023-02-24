import java.util.ArrayList;

class Solution {
    public String solution(String letter) {
        String answer = "";
        
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] tmpletter = letter.split(" ");
        
        for(int i=0; i<tmpletter.length; i++){
            for(int j=0; j<morse.length; j++){
                if(morse[j].equals(tmpletter[i])){
                    char a=(char)(j+97);
                    answer+=a;
                }
            }
        }
        
        return answer;
    }
}