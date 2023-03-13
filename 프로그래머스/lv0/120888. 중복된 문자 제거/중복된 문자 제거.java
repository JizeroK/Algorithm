class Solution {
    public String solution(String my_string) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<my_string.length(); i++){
            String tmp = my_string.charAt(i)+"";
            if(answer.contains(tmp)){
                continue;
            }
            sb.append(my_string.charAt(i));
            answer = sb.toString();
        }
        
        
        return answer;
    }
}