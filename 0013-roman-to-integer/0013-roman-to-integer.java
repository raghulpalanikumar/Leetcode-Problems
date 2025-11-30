class Solution {
    public int romanToInt(String s) {
        int prev = 0;
        int n = 0;
        int ans=0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char s1 = s.charAt(i);
            switch (s1) {
                case 'I': n = 1; break;
                case 'V': n = 5; break;
                case 'X': n = 10; break;
                case 'L': n = 50; break;
                case 'C': n = 100; break;
                case 'D': n = 500; break;
                case 'M': n = 1000; break;
            }

            if(n<prev)
            {
                ans=ans-n;
            }
            else
            {
             ans+=n;
            }
            prev=n;
        }
        return ans;
    }
}
