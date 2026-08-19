class Solution {
    public int majorityElement(int[] nums) {
       int candidate = nums[0];
       int count = 0;
       for (int i=0;i<nums.length;i++){
        if(nums[i] == candidate){
            count ++;
        }else{
            count--;
            if (count == 0){
                candidate = nums[i+1];
            }
        }    
       }
    return candidate;
    }
    //Test Case
    public void main(String[] args) {
        int [] nums = {1,2,1,1,1,2};
        System.out.println(majorityElement(nums));
    }
}