class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet();
        while(n!=1)
        {
            if(s.contains(n))
            {
                return false;
            }
        s.add(n);
        n= trav(n);
        }
        return true;
    }

    int trav(int n)
    {
        int sum=0;
        while(n>0)
        {
        int digit = n%10;
        sum+= digit*digit;
        n=n/10;
        }
        return sum;
    }
}