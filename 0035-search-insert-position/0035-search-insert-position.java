class Solution {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] <= target){
                index = i;
            }
        }
        if(target <= nums[0]){
            return 0;
        }else{
        return nums[index] == target ? index : index + 1;
        }
    }
}