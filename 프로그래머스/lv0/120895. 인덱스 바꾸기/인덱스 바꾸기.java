class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        String tmp = String.valueOf(my_string.charAt(num1));
        String tmp2 = String.valueOf(my_string.charAt(num2));

        for(int i=0; i<my_string.length(); i++){
            if(i==num1){
                sb.append(tmp2);
            }else if(i==num2){
                sb.append(tmp);
            }else{
                sb.append(my_string.charAt(i));
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}