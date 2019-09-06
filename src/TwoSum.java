
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test1[] = {1,2,3};
		int ans1[] = twoSum(test1,4);
		for(int x : ans1) {
			System.out.println(x);
		}

	}
	
    public static int[] twoSum(int[] numbers, int target)
    {
    	int ans[] = {0,0};
    	for(int i = 0 ; i < numbers.length ; i++) {
    		for( int j = i + 1 ; j < numbers.length ; j++) {
    			if(numbers[i] + numbers[j] == target) {
    				ans[0] = i;
    				ans[1] = j;
    			}
    		}
    	}
    	
    	
        return ans; // Do your magic!
    }

}
