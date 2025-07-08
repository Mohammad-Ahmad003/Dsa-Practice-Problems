class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());

        for(int num:nums){
            int reslen=res.size();
            for(int j=0;j<reslen;j++){
                List<Integer> sets= new ArrayList<>(res.get(j));
                sets.add(num);
                res.add(sets);
            }
        }
        return res;
    }
}