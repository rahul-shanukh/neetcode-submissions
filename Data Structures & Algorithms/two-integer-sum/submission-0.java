class Solution {
    public int[] twoSum(int[] nums, int target) {

        if(nums == null) return new int[0];

        Map<Integer , Integer> map = new HashMap<>();

        int idx = 0;
        int[] res = new int[2];
        for(int n : nums){
           
           int comp =  target - n;

           if(map.containsKey(comp)){
             res[0] = map.get(comp);
             res[1] = idx;
             return res;
           }
           map.put(n , idx);
           idx++;
           
        }
      return res;  
    }
}
