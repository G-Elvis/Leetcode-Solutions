class Solution{
    public int minOperations(int []nums, int k){
        int sum = nums[0];

        for (int i=1;i<nums.length;i++){
            sum += nums[i];
            if(sum % k == 0){
                return 0;
            }
        }
    return sum % k;
    }

    public void main(String[] args) {
        int [] nums = {3,9,7};
        int k = 5;

        System.out.println(minOperations(nums,k));
    }
}