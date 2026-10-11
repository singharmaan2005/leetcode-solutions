class Solution {
    public int sumOfSquares(int[] nums) {
        int res = 0;
        int[] arr = new int[nums.length];
        int n = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (n % (i+1) == 0) {
                arr[i] = nums[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            res += arr[i] * arr[i];
        }

        return res;
    }
}