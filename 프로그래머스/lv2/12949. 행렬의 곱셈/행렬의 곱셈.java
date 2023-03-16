class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        answer = new int[arr1.length][arr2[0].length];
        
        for(int i=0; i<arr1.length; i++){  //3  0,1,2
            for(int j=0; j<arr2[0].length; j++){  // 4  0,1,2,3
                for(int k=0; k<arr2.length; k++){  // 2  0,1
                    answer[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}