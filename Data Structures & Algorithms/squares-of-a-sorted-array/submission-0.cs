public class Solution {
    public int[] SortedSquares(int[] nums) {
        int n = nums.Length;
        int i = 0;
        int j = n - 1;
        int k = n - 1;
        int[] arr = new int[n];

        while(k >= 0){
            if(nums[i] * nums[i] > nums[j] * nums[j]){
                arr[k--] = nums[i]*nums[i++];
            }else{
                arr[k--] = nums[j]*nums[j--];
            }
        }

        return arr;
    }
}