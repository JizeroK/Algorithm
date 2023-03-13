class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        int tmp = 0;
        
        answer = 1;
        for(int i=0; i<box.length; i++){
            tmp = box[i]/n;
            answer = answer*tmp;
        }
        
        return answer;
    }
}