class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;

        int i = 0; 
        int j = n - 1;

        while(i < j){
            int total = numbers[i] + numbers[j];
            if(total == target) return new int[] {i + 1, j + 1};
            if(total < target) i++;
            else j--;
        }

        return new int[]{-1, -1};
    }
}
