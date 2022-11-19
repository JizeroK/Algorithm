class Solution {
    public String solution(String s) {
        String answer = "";
        boolean check=true;
        StringBuilder builder=new StringBuilder(s);
        char c;
        
        for(int i=0; i<s.length(); i++){
            c=s.charAt(i);
            if(c==' ') check=false;  //빈칸 만나면 무조건 else문으로 
            if(check){  //check==true 일때
                check=false;
                if(!Character.isLowerCase(c))
                    continue;
                builder.setCharAt(i, Character.toUpperCase(c));
                
            }
            else{
                check=true;
                if(!Character.isUpperCase(c))
                    continue;
                builder.setCharAt(i, Character.toLowerCase(c));
                
            }
        }
        
        answer=builder+"";
        
        return answer;
    }
}
