import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int min_index=0;
        int i=0;
        for(i=0; i<arr.length; i++){
            if(arr[min_index]>arr[i])
                min_index=i;
        }

        if(i==1){
            answer=new int[1];
            answer[0]=-1;
        }
        else{
            ArrayList<Integer> list=new ArrayList<>();
            for(int a: arr){
                list.add(a);
            }
            list.remove(min_index);
            answer=new int[list.size()];
            //answer=list.stream().mapToInt(Integer::intValue).toArray();
            for(int j=0; j<list.size(); j++){
                answer[j]=list.get(j);
            }
        }


        return answer;
    }
}