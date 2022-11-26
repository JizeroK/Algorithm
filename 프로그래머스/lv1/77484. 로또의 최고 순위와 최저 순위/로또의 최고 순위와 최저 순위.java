class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        answer = new int[2];
        int win=0;
        int unknown=0;
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]==0) {
                unknown++;
                continue;
            }
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j]){
                    win++; //0을 제외한 맞춘갯수
                    continue;
                }
            }
        }
        
        int max=0, min=0;
        
        max=win+unknown; //0으로 표시된 것이 다 맞았을 때 (unknown은 0이 될 수도 있다.)
        switch(max){
            case 6: answer[0]=1; break;
            case 5: answer[0]=2; break;
            case 4: answer[0]=3; break;
            case 3: answer[0]=4; break;
            case 2: answer[0]=5; break;
            default: answer[0]=6; 
        }
        
        min=win; //0으로 표시된 것이 다 틀렸을 때
        switch(min){
            case 6: answer[1]=1; break;
            case 5: answer[1]=2; break;
            case 4: answer[1]=3; break;
            case 3: answer[1]=4; break;
            case 2: answer[1]=5; break;
            default: answer[1]=6; 
        }
        
        return answer;
    }
}