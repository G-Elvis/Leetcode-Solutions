class Solution{
    public int maxSubArray(int [] nums){
        int windowSum = nums [0];
        int maxSum = nums[0];

        for (int i =1; i < nums.length;i++){
            windowSum = Math.max(nums[i], windowSum+nums[i]);
            maxSum = Math.max(maxSum, windowSum);
        }
    return maxSum;
    }

    public void main(String [] args){
        int [] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
        }
}