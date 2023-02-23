class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        StringBuffer str = new StringBuffer();
        
        for(int i=code-1; i<cipher.length(); i+=code){ 
            str.append(cipher.charAt(i));
        }
        
        answer = str.toString();
            
        return answer;
    }
}