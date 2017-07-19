import java.util.Arrays;


public class Solution {



	public int solution(String s) {
		int noOfWords = 0;

		System.out.println(s);

		int ex = s.indexOf("!");
		int dot = s.indexOf(".");
		int q = s.indexOf("\\?");

		System.out.println(ex + " " +  dot + " " +  q);

		int arr[] = {ex, dot, q};

		Arrays.sort(arr);

		String [] first, second, third, fourth;
		int oldCount=0, latestCount=0;
		int maxNo = 0;


		for (int a = 0; a < arr.length; a++) {

			if(arr[a] <0)
				continue;

			System.out.println(arr[a]);


			first =  s.split(s.charAt(arr[a])+"");

			if(first.length > 1){
				second = first[0].split(" ");
				oldCount = latestCount;
				latestCount=second.length;
			}


			if(oldCount>latestCount)
				maxNo=oldCount;
			else 
				maxNo=latestCount;
		}



		System.out.println("Max count is:" + maxNo);
		return maxNo;
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		String S = "We test coders ok. Give us a try?";
		sol.solution(S);


	}

}
