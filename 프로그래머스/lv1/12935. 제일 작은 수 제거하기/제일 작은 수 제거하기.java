import java.util.*;
class Solution {
	public int[] solution(int[] arr) {

		int[] answer={};
		int[] one={-1};		

		if(arr.length==1) {
			answer=one;
		}else if(arr.length!=1){

			int[] arr1 = new int[arr.length-1];

			//최소값 min 구하기
			int min = arr[0];
			for(int i=1;i<arr.length;i++) {
				if(min>arr[i]) {
					min = arr[i];
				}
			}

			
			boolean sw=false;  //true일때 앞으로 땡기기
			for(int i=0;i<arr1.length;i++) {
				if(min==arr[i] && sw==false){
					arr1[i]=arr[i+1];
                    System.out.println(arr1[i]);
					sw = true;  //최소값 제거
				}
                if(sw==false){
                    arr1[i]=arr[i];
                }
                if(sw==true){
                    arr1[i]=arr[i+1];
                }
			}
            answer = arr1;    
		}
		return answer;
	}
}