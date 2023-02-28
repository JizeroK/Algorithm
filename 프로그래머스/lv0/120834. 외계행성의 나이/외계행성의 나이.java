class Solution {
    public String solution(int age) {
        String answer = "";
        StringBuffer ans=new StringBuffer();
        
        String str = Integer.toString(age);
        
        for(int i=0; i<str.length(); i++){
            ans.append((char)(str.charAt(i)+49));
        }
        
        answer=ans.toString();
        
        return answer;
    }
}