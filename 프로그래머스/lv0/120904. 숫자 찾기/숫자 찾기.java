class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
        String ans = Integer.toString(num);
        char charK = (char)(k+48); 
        
        answer=-1;
        for(int i=0; i<ans.length(); i++){
            if(ans.charAt(i)==charK){
                answer=i+1;
                break;
            }
        }
        
        return answer;
    }
}