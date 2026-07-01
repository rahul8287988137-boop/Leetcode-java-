class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
       long sum = 0;
        for(int i = nums.length - 1; i >=nums.length - k ; i--){
            if(mul == 0){
                sum += nums[i];
            }
            else{
            sum += (long)nums[i] * mul;
            mul--;
            }
        }
        return sum;
    }
}