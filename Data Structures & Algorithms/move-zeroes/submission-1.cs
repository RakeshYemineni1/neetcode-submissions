public class Solution {
    public void MoveZeroes(int[] nums) {
        int n = nums.Length;
        int i = 0;
        int j = 0;
        for(i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }

        for(i = j; i < n; i++){
            nums[i] = 0;
        }
    }
}