class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int h = 0;
        if(nums == null || nums.length == 0){
            return;
        }
       while(h < nums.length){
        if(nums[h] != 0){
            swap(nums ,l,h);
            l++;
        }
        h++;

       }
    }
    void swap(int[] nums,int l, int h){
        int temp = nums[l];
        nums[l] = nums[h];
        nums[h] = temp;
    }
}