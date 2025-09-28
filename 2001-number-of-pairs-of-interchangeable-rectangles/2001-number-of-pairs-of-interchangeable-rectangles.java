class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Integer> p = new HashMap<>();
        long count=0;
        for(int i=0;i<rectangles.length;i++)
        {
            double ratio = (double)rectangles[i][0]/rectangles[i][1];
            count = count+p.getOrDefault(ratio,0);
            p.put(ratio,p.getOrDefault(ratio,0)+1);
        }
        return count;
    }
}