class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char ch;
        
        if(s.length()==4||s.length()==6){
            for(int i=0; i<s.length(); i++){
                ch=s.charAt(i);
                if(!(48<=ch&&ch<=57)){
                    answer=false;
                    break;
                }
            }
        } else{
            answer=false;
        }
        
        return answer;
    }
}