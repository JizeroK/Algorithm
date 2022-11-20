class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String result;
        
        answer=new String[arr1.length];
        for(int i=0; i<arr1.length; i++){
            //System.out.println(Integer.toBinaryString(arr1[i]|arr2[i]));
        
            result = String.format("%" + arr1.length + "s", Integer.toBinaryString(arr1[i]|arr2[i]));
            //System.out.println(result);
            
            result=result.replace("1", "#");
            result=result.replace("0", " ");
            answer[i]=result;
        }
        
        return answer;
    }
}