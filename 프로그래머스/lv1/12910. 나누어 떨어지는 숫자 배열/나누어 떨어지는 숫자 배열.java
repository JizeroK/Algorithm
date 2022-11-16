import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        String str= "";

        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0)
                str=str+arr[i]+" ";
        }

        String[] s_ans=str.split(" ");
        answer=new int[s_ans.length];
        for(int i=0; i<s_ans.length; i++){
            if(s_ans[i]=="") {
                answer[i]=-1;
                break;
            }
            answer[i]=Integer.parseInt(s_ans[i]);
        }
        Arrays.sort(answer);

        return answer;
    }
}