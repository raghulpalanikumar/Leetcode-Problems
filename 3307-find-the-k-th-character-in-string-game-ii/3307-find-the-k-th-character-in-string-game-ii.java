class Solution {
    public char kthCharacter(long k, int[] operations) {
        int shift = 0;
        for(int i=operations.length-1;i>=0;i--)
        {
            long l = 1<<Math.min(i,60);
            if(k>l)
            {
                k-=l;
                if(operations[i]==1)
                {
                    shift++;
                }
            }
        }
        return (char)('a'+(shift%26));
    }
}