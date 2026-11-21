class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length + 1];
        for (int num : nums) {
            visited[num] = true;
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!visited[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}