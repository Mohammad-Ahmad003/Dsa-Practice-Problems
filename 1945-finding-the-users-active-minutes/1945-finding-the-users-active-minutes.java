class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int freq[]= new int[k];
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int pair[]: logs){
            int userId = pair[0];
            int minutes = pair[1];
            
            map.putIfAbsent(userId,new HashSet<>());
            
            map.get(userId).add(minutes);
        }

        for(Map.Entry<Integer,HashSet<Integer>> entry:map.entrySet()){
            int uam=entry.getValue().size()-1;
            freq[uam]++;
        }
        return freq;
    }
}