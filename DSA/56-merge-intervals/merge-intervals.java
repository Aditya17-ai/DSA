class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> ret = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            if (ret.isEmpty() || ret.get(ret.size()-1)[1] < intervals[i][0]) {
                ret.add(intervals[i]);
            } else {
                ret.get(ret.size()-1)[1] = Math.max(ret.get(ret.size()-1)[1], intervals[i][1]);
            }
        }        

        return ret.toArray(new int[ret.size()][]);
    }
}