class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        
        int i=0;
        int j=0;
        for(i=0; i<arr1.length; i++){
            for(j=0; j<arr1[i].length; j++){
                
            }
        }
        answer = new int[i][j];
        
        for(int x=0; x<arr1.length; x++){
            for(int y=0; y<arr1[x].length; y++){
                answer[x][y]=arr1[x][y]+arr2[x][y];
            }
        }
        
        return answer;
    }
}