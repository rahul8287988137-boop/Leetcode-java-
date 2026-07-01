class Solution {
    public int[] sortArray(int[] nums) {
        if(nums == null || nums.length<=1){
            return nums;
        }
        int min = nums[0];
        int max = nums[0];
        for(int num : nums){
            if(num<min){
                min = num;
            }
            if(num>max){
                max = num;
            }
        }
        int[] countNums = new int[max-min+1];
        for(int num: nums){
            countNums[num-min]++;
        }
        int index = 0;
        for(int i = 0; i<countNums.length;i++){
            while(countNums[i]>0){
                nums[index] = i+min;
                index++;
                countNums[i]--;
            }
        }
        return nums;
    }
}