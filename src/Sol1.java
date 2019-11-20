
public class Sol1 {

	public static void main(String[] args) {
		int[] numArray = {2,2,3,4,3,3,2,2,1,1,2,5};
		System.out.println(solution(numArray));
	}

	private static int solution(int[] A) {
		int totalInteration = 0;
		int count = 1 ;
		int value = A[0];
		while(value != -1) {
			value = A[value];
			count++;
		}
		return count;
	}
}