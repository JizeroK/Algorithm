import java.util.Arrays;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        String[] cache = new String[cacheSize];
        int j=0;
        int num=0;
        
        Loop1 : for(int i=0; i<cities.length; i++){
            if(cacheSize==0){   //캐시 사이즈가 0이면
                answer=cities.length*5;
                break;
            }
            
            for(j=0; j<cacheSize; j++){  
                if(cities[i].equalsIgnoreCase(cache[j])){ //같은게 있으면
                    answer+=1;
                    num = j;
                    break;
                }
            }
            
            if(j==cacheSize){ //같은게 없으면
                answer+=5;
                num=j-1;
            }
                
            cache[num]=null;
            for(int k=num; k>=1; k--){
                cache[k]=cache[k-1];
            }
            cache[0]=cities[i];
            
        }
        
        return answer;
    }
}