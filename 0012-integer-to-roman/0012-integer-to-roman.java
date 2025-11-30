class Solution {
    int value[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String symbol[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num) {
    StringBuilder s = new StringBuilder();
    for(int i=0;i<value.length;i++)
    {
        while(num>=value[i])
        {
        s.append(symbol[i]);
        num=num-value[i];
        }
    }
    return s.toString();
    }                                                               
}
