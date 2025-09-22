#define min(a,b) ((a<b)?(a):(b))
int trap(int* height, int heightSize) {
    int left[heightSize];
    int right[heightSize];
    int max=-1;
    for(int i=0;i<heightSize;i++)
    {
        if(height[i]>max)
        {
            max=height[i];
        }
        left[i]=max;
    }
    max=-1;
    for(int j=heightSize-1;j>=0;j--)
    {
        if(height[j]>max)
        {
            max=height[j];
        }
        right[j]=max;
    }
    int total=0;
    for(int i=0;i<heightSize;i++)
    {
        total+= min(left[i],right[i])-height[i]; 
    }
    return total;
}