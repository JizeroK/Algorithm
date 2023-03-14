class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = 0;
        int min = 0;

        max = Math.max(sides[0], sides[1]);
        min = Math.min(sides[0], sides[1]);
        
        answer = (max-(max-(min-1)))+1;
        answer += (max+min-1)-(max+1)+1;
        
        return answer;
    }
}