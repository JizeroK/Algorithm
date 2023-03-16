class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        String[] cache = new String[cacheSize];

        Loop1 : for(int i=0; i<cities.length; i++){
            if(cacheSize==0){ 
                answer=cities.length*5;
                break;
            }

            for(int j=0; j<cacheSize; j++){  
                if(cities[i].equalsIgnoreCase(cache[j])){ 
                    answer+=1;
                    cache[j]=null;
                    for(int k=j; k>=1; k--){
                        cache[k]=cache[k-1];
                    }
                    cache[0]=cities[i];
                    continue Loop1;
                }
            }

            answer+=5;
            cache[cacheSize-1]=null;
            for(int k=cacheSize-1; k>=1; k--){
                cache[k]=cache[k-1];
            }
            cache[0]=cities[i];
            
        }

        return answer;
    }
}