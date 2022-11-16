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

			boolean sw=false;  //true일때 앞으로 땡기기 시작
			for(int i=0;i<arr1.length;i++) {
				if(min==arr[i] && sw==false){  //최소값을 만났을때만 실행되는 if문
					arr1[i]=arr[i+1];
					sw = true;  //최소값이 나왔다는 표시
				}
				else if(sw==true){ //최소값이 나온 뒤 배열 땡기기
					arr1[i]=arr[i+1];
				}
				else if(sw==false){ //아직 최소값이 나오지 않았을 때
					arr1[i]=arr[i];
				}
				
			}
			answer = arr1;    
		}
		return answer;
	}
}