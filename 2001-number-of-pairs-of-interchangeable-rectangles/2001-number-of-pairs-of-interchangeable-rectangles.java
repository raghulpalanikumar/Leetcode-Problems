class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Integer> ans = new HashMap<>();
        int count=0;
        for(int i=0;i<rectangles.length;i++)
        {
        double ratio = (double)rectangles[i][0]/rectangles[i][1];
        if(ans.containsKey(ratio))
        {
        count = count+ans.get(ratio);
        }
        ans.put(ratio,ans.getOrDefault(ratio,0)+1);
        }
        return count;
    }
}