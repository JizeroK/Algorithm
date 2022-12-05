import java.util.Stack;
    
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> dollStack=new Stack<Integer>();
        
        for(int i=0; i<moves.length; i++){  
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1]!=0) {  //인형이 존재하면
                    if(dollStack.size()==0 || dollStack.peek()!=board[j][moves[i]-1]){  
                        dollStack.push(board[j][moves[i]-1]);
                    }
                    
                    else {  //인형이 겹치는 경우
                        dollStack.pop();  
                        answer+=2;
                    }
                    
                    board[j][moves[i]-1]=0;  
                    break;
                }
            }
        }
        
        return answer;
    }
}