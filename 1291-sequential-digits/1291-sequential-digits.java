class Solution {
    public List<Integer> sequentialDigits(int loww, int highh) {
    List<Integer> l = new ArrayList<>();
    String digit = "123456789";
    int low = String.valueOf(loww).length();
    int high = String.valueOf(highh).length();
    for(int i=low;i<=high;i++)
    {
        int t=0;
        for(int j=i;j<=9;j++)
        {   
        int num = Integer.parseInt(digit.substring(t++,j));
        if(num>=loww && num<=highh)
        {
            l.add(num);
        }
        }
    }
    return l;
    }
}
