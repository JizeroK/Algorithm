class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.matches("-?\\d+(\\.\\d+)?")&&(s.length()==4 || s.length()==6))
            answer=true;
        return answer;
    }
}