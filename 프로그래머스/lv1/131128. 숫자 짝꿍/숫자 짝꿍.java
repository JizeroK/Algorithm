class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();
        int[][] num=new int[2][10];
        
        for(int i=0; i<X.length(); i++){
            num[0][X.charAt(i)-48]++;
        }
        
        for(int i=0; i<Y.length(); i++){
            num[1][Y.charAt(i)-48]++;
        }
        
        for(int i=9; i>=0; i--){
            if(num[0][i]==0 || num[1][i]==0){
                continue;
            }
            else{
                if(i==0 && stringBuilder.toString().equals("")) {
                    stringBuilder.append(0);
                }
                else {
                    for(int j=0; j<Math.min(num[0][i], num[1][i]); j++){
                        stringBuilder.append(i);
                    }
                }
            }
        }
        
        answer=stringBuilder.toString();
        if(answer.equals("")) answer="-1";
        
        return answer;
    }
}