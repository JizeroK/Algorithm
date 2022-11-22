class Solution {
    public String solution(int a, int b) {
        String answer = "";
        //String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
                    //나머지  3 4 5 6 0 1 2
        String[] day = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int sum=0;
        //1월1일은 금요일
        for(int i=1; i<a; i++){
            if(i<=7){
                if(i==2) sum+=29;
                else if(i%2==0) sum+=30;
                else sum+=31;
            }
            else{
                if(i%2==0) sum+=31;
                else sum+=30;
            }
            
        }
        
        sum+=b;
        
        answer = day[sum%7];
        
        return answer;
    }
}