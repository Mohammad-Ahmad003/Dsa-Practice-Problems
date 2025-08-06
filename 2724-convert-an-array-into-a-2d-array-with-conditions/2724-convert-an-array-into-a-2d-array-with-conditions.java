class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int num : nums) {
            int rowIndex = map.getOrDefault(num, 0);
            if (rowIndex == result.size()) {
                result.add(new ArrayList<>());
            }
            result.get(rowIndex).add(num);
            map.put(num, rowIndex + 1);
        }
        return result;
    }
}
