import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {}; 
        int c=0;
        HashSet<Integer> hash = new HashSet<>();
            
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                hash.add(numbers[i]+numbers[j]);
            }
        }
        
        answer=new int[hash.size()];
        
        Iterator it=hash.iterator();
	    while(it.hasNext()){
            String t=it.next()+"";
            answer[c]=Integer.parseInt(t);
            c++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
