public class CP_Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[2*(nums.length)];
        for(int i=0; i<nums.length; i++){
            ans[i]=nums[i];
        }
        
        int j=0;
        for(int i=nums.length; i<ans.length; i++){
            ans[i]=nums[j++];
        }
        
        return ans;
    }
    public static void main(String[] args) {
        
    }   
}