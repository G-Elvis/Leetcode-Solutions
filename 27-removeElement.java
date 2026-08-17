class Solution{
    public int removeElement(int [] nums, int val){
        int k = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
    return k;
    }

    //Test Case
    public void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int test = removeElement(nums, val);
        System.out.println(test);
        
        for (int i=0;i<test;i++){
            System.out.print(nums[i] + ",");
        } 
    }
}