class Solution{
    public int maxProduct(int [] nums){
        int currentMax = nums[0];
        int currentMin = nums[0];
        int maxProduct = nums[0];

        for(int i=1;i<nums.length;i++){
            int oldMax = currentMax;
            int oldMin = currentMin;

            currentMax = Math.max(nums[i], Math.max(nums[i] * oldMax, nums[i] * oldMin));
            currentMin = Math.min(nums[i], Math.min(nums[i] * oldMax, nums[i] * oldMin));
            maxProduct = Math.max(maxProduct, currentMax);
        }
    return maxProduct;
    }

    //Test Case
    public void main(String[] args) {
        int nums [] = {-1,4,-4,5,-2,-1,-1,-2,-3};
        System.out.println(maxProduct(nums));
    }
}