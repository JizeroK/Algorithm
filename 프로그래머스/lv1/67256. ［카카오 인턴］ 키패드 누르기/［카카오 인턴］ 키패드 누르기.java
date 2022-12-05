import java.util.Stack;

class Solution {
    public String solution(int[] numbers, String hand) {  //hand는 무슨 잡이인지
        String answer = "";
        int[][] keypad={{1, 2, 3},      //00, 01, 02
                        {4, 5, 6},      //10, 11, 12
                        {7, 8, 9},      //20, 21, 22  
                        {10, 0, 10}};   //30, 31, 32
        Stack<Integer> L_position = new Stack<>();
        Stack<Integer> R_position = new Stack<>();
        L_position.push(10); //왼손 첫 시작 위치
        R_position.push(10); //오른손 첫 시작 위치
        
        for(int i=0; i<numbers.length; i++){   //눌러야 되는 번호
            
            for(int j=0; j<keypad.length; j++){
                for(int k=0; k<keypad[j].length; k++){
                    if(numbers[i]==keypad[j][k]){   //키패드 행, 열 구하기
                        //if(j==3&&k==0 || j==3&&k==2) continue;
                        if(k==0){
                            answer+="L";
                            L_position.push(numbers[i]);
                        }
                        else if(k==2){
                            answer+="R";
                            R_position.push(numbers[i]);
                        }
                        else if(k==1){  //2, 5, 8, 0
                            int left=0, right=0;
                            for(int m=0; m<keypad.length; m++){
                                for(int n=0; n<keypad[m].length; n++){
                                    if(L_position.size()>1 && R_position.size()>1 && (m==3&&n==0 || m==3&&n==2)) continue;
                                    if(keypad[m][n]==L_position.peek()){
                                        left=Math.abs(m-j)+Math.abs(n-k);
                                    }
                                    
                                    if(keypad[m][n]==R_position.peek()){
                                        right=Math.abs(m-j)+Math.abs(n-k);
                                    }
                                }
                            }
                            
                            if(left>right){
                                answer+="R";
                                R_position.push(numbers[i]);
                            }
                            else if(left<right){
                                answer+="L";
                                L_position.push(numbers[i]);
                            }
                            else{
                                if(hand.equals("left")){
                                    answer+="L";
                                    L_position.push(numbers[i]);
                                }
                                else{
                                    answer+="R";
                                    R_position.push(numbers[i]);
                                }
                            }
                            
                        }
                        
                    }
                }
            }
            
        }
        
        return answer;
    }
}