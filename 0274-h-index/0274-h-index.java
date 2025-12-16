class Solution {
    public int hIndex(int[] citations) {
        int count=0;
        int index=0;
        for(int i=0;i<citations.length;i++)
        {
            if(citations[i]>=++index)
            {
                count++;
            }
        }
        return count;
    }
}