class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer , Integer> map = new LinkedHashMap<>();

        for(int n : nums){
            map.put(n , map.getOrDefault(n , 0 ) + 1);
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];

        for(int n : map.keySet()){
           if(bucket[map.get(n)] == null){
              bucket[map.get(n)] = new ArrayList<>();
           }  
           bucket[map.get(n)].add(n);
        }
        int[] res = new int[k];
        int  index = 0;
        
        for(int i = bucket.length - 1 ; i >= 0 && index < k ; i--){
         
            if(bucket[i] != null){

                for(int n : bucket[i]){
                    res[index++] = n ;
                    if(index == k){
                        break;
                    }
                }
            }
 
        }
        return res;
    }

}
