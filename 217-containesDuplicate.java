import java.util.HashSet;

class Main{
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i =0; i < nums.length; i++){
            if(seen.contains(nums[i])){
                return true;
            }else{
                seen.add(nums[i]);
            }
        }
    return false;
    }
    
    //Test Case
    public void main(){
        int [] nums = {1,2,3,4,6,5,4};
        System.out.println(containsDuplicate(nums));
    }
}