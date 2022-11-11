class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum=0;
        
        String tmp=""+x;
        String[] str=tmp.split("");
        for(String s: str){
            sum+=Integer.parseInt(s);
        }
        
        if(x%sum!=0) answer=false; 
        
        return answer;
    }
}