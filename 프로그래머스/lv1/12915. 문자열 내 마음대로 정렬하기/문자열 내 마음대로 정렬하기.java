class Solution {
   public static String[] solution(String[] strings, int n) {
		String[] answer = {};

		for (int i=0; i<strings.length-1; i++) {
			for (int j=strings.length-1; j>i; j--)	{
				if(strings[j-1].charAt(n)>strings[j].charAt(n)){
					String tmp=strings[j-1];
					strings[j-1]=strings[j];
					strings[j]=tmp;
				}
				else if(strings[j-1].charAt(n)==strings[j].charAt(n)){
					if(strings[j-1].compareTo(strings[j])>0){
						String tmp=strings[j-1];
						strings[j-1]=strings[j];
						strings[j]=tmp;
					}
				}
			}
		}

		answer=strings;

		return answer;
	}
}