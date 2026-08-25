import java.util.HashSet;

class Solution{
    public int missingMultiple(int [] nums, int k){
        HashSet <Integer> present = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            present.add(nums[i]);
        }
        int multiple = k;
        while(present.contains(multiple)){
            multiple +=k;
        }
    return multiple;
    }

    public void main(String[] args) {
        int [] nums = {8,2,3,4,6};
        int k = 2;
        System.out.println(missingMultiple(nums, k));
    }
}