import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        /*
        String str=Long.toString(n);
        String[] arr=str.split("");
        
        answer=new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            answer[i]=Integer.parseInt(arr[(arr.length-1)-i]);
            //System.out.print(answer[i]+" ");
        }*/
        
        String s=""+n;
        answer=new int[s.length()];
        int i=0;
        
        while(n>0){
            answer[i]=(int)(n%10);
            n/=10;
            i+=1;
        }
        return answer;
    }
}