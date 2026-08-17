class Solution{
    public int removeDuplicates(int [] nums){
        int k = 0;
        for (int i=0; i< nums.length;i++){
            if(k < 2){
                nums[k] = nums [i];
                k++;
            }else{
                if (nums[i] != nums[k-2]){
                    nums[k] = nums[i];
                    k++;
                }
            }
        }
        return k;
    }
//Test Case
    public void main (String [] args){
        int [] nums = {1,1,1,2,2,3};
        int test = removeDuplicates(nums);
        System.out.println(test);
        for (int i=0;i<test;i++){
            System.out.print(nums[i]);
        }
    }
}