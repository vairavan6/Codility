
public class Sol3 {

	public static void main(String[] args) {
		int[] numArray = {2,2,3,4,3,3,2,2,1,1,2,5};
		System.out.println(peaksAndValleys(numArray));
	}

	private static int peaksAndValleys(int[] nums) {
		int size = nums.length;
		if(nums == null || size == 0)
			return 0;
		if(size == 1)
			return 1;
		int castle = 1;
		int current = 0, next = current + 1;
		while(current < size && next < size){
			if(nums[next] == nums[current]){
				++current;
				++next;
				
				// Hill Case
			} else if (nums[next] > nums[current]){
				++castle;
				int k = next + 1;
				while(k < size && nums[k] >= nums[k - 1]){
					++k;
				}
				System.out.println("Hilles "+next);
				if(k == size)
					return castle;
				current = k - 1;
				next = k;

				// Valley Case
			} else if (nums[next] < nums[current]){
				++castle;
				int k = next + 1;
				while(k < size && nums[k] <= nums[k - 1]){
					++k;
				}
				System.out.println("Valleys "+next);
				if(k == size)
					return castle;
				current = k - 1;
				next = k;
			}
		}
		return castle;
	}
}

//2,2,3,4,3,3,2,2,1,1,2,5;
//0,1,2,3,4,5,6,7,8,9,10,11

//  34       5  
//22  3322112
