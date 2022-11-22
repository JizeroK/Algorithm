import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {}; 
        int c=0;
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
            
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                linkedHashSet.add(numbers[i]+numbers[j]);
            }
        }
        
        answer=new int[linkedHashSet.size()];
        
        Iterator it=linkedHashSet.iterator();
	    while(it.hasNext()){
            String t=it.next()+"";
            answer[c]=Integer.parseInt(t);
            c++;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
