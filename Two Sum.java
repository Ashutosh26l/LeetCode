class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(target==nums[i]+nums[j] && i!=j){
                    return( new int[] {i,j});
                }
            }
            
        }
        return (new int []{0,0});
    }
}