public class Solution {
    public void MoveZeroes(int[] nums) {
        int n = nums.Length;
        int i = 0;
        int j = 0;
        for(i = 0; i < n; i++){
            if(nums[j] == 0 && nums[i] != 0){
                nums[j] = nums[i];
                nums[i] = 0;
                j++;
            }
            if(nums[j] != 0) j++;
        }
    }
}