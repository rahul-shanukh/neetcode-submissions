class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        boolean[] seen = new boolean[100001];

        for(int n : nums){    

            int idx = n + 10000;

            if(seen[idx]){
                return true;
            }
            seen[idx] = true;
        }
         return false;   
    }
}