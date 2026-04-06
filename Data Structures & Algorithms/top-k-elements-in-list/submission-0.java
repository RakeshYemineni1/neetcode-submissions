class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[][] freq = new int[2002][2];
        for(int n : nums){
            freq[n + 1000][0] = n;
            freq[n + 1000][1] += 1;
        }
        Arrays.sort(freq, (a, b) -> Integer.compare(b[1], a[1]));
        int[] res = new int[k];

        for(int i = 0; i < k; i++){
            res[i] = freq[i][0];
        }
        return res;
    }
}
