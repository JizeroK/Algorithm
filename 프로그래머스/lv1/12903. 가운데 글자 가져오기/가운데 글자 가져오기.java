class Solution {
    public String solution(String s) {
        String answer = "";
        
        int len=s.length();
        if(len%2==1)
            answer=String.valueOf(s.charAt(len/2));
        else
            answer=String.valueOf(s.charAt(len/2-1))+String.valueOf(s.charAt(len/2));
        
        return answer;
    }
}

/*
 String answer = "";
        
        int tmp;
        char[] tmpStr = s.toCharArray();
        tmp = tmpStr.length/2;
        
        if(tmpStr.length%2!=0) //홀수일때
            answer = String.valueOf(tmpStr[tmp]);
        else //짝수일때
            answer = String.valueOf(tmpStr[tmp-1])+String.valueOf(tmpStr[tmp]);

        return answer;
*/