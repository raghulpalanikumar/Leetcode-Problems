class Solution {
    public boolean isHappy(int n) {
    Set<Integer> m = new HashSet<>();
    while(n!=1)
    {
    if(m.contains(n))
    {
    return false;
    }
    m.add(n);
    n=trav(n);
    }
    return true;
    }

    int trav(int n)
    {
        int sum=0;
        while(n>0)
        {
         int digit=n%10;
         sum+=digit*digit;
         n=n/10;
        }
        return sum;
    }
}