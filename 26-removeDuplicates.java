class Solution1{
    public int removeDuplicates(int [] nums){
        if (nums.length == 0){
            return 0;
        }

        int i = 0;
        for (int j = 0; j < nums.length; j++){
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    //Test Case 
    public static void main(String[] args){
        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        Solution1 obj = new Solution1();
        System.out.println(obj.removeDuplicates(arr));
    }
}