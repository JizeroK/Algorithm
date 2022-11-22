import java.util.ArrayList;
import java.lang.Math;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] s1arr = {1,2,3,4,5};  //배열크기: 5
        int[] s2arr = {2,1,2,3,2,4,2,5}; //배열크기: 8
        int[] s3arr = {3,3,1,1,2,2,4,4,5,5};  //배열크기: 10
        int[] stu = new int[3];
        int max=0;
       
        for(int i=0; i<answers.length; i++){
            if(answers[i]==s1arr[(i%s1arr.length)]) stu[0]+=1;
            if(answers[i]==s2arr[(i%s2arr.length)]) stu[1]+=1;
            if(answers[i]==s3arr[(i%s3arr.length)]) stu[2]+=1;
        }
        
        max=Math.max(stu[0], Math.max(stu[1], stu[2]));
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<stu.length; i++){
            if(max==stu[i]) list.add(i+1);
        }
        
        answer=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        
        return answer;
    }
}