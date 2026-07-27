public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int n = nums.Length;

        int i = 0, j = 0;

        for(i = 1; i < n; i++){
            if(nums[i] != nums[j]){
                nums[j + 1] = nums[i];
                j++;
            }
        }
        return j + 1;
    }
}