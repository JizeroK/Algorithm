class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer = {};
        int c=0;
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                c++;
            }
        }
        
        answer = new int[c];
        c=0;
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n==0){
                answer[c]=numlist[i];
                c++;
            }
        }
        
        return answer;
    }
}