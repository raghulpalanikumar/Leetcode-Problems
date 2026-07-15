class Solution {
    public int gcdOfOddEvenSums(int n) {
    int oddsum = 0;
    int evensum = 0;
    int temp = n;
    int i=1;
    int count=1;
    while(count<=n)
    {
    if(i%2==0)
    {
    evensum+=i;
    }
    else
    {
    oddsum+=i;
    }
    count++;
    }
    int result = gcd(oddsum,evensum);
    return result;
    }
    int gcd(int a,int b)
    {
    while(b!=0)
    {
        int temp = a/b;
        b = a%b;
        a=temp;
    }
    return a;
    }
}