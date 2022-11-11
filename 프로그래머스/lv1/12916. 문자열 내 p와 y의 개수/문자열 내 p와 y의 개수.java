class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p_cnt=0;
        int y_cnt=0;

        String[] str=s.split("");
        for(String ss: str){
            if(ss.equalsIgnoreCase("p")) p_cnt++;
            else if(ss.equalsIgnoreCase("y")) y_cnt++;
        }

        //if(p_cnt==y_cnt) answer=true;
        if(p_cnt!=y_cnt) answer=false;
        
        return answer;
    }
}