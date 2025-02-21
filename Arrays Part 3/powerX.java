class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        long val=(long)Math.abs(n);
        if(n==Integer.MIN_VALUE && x!=1 && x!=-1) return 0;
        System.out.println(val);
        while(val>0)
        {
            if(val%2!=0)
            {
                ans=x*ans;
                val-=1;
            }
            else
            {
                x=x*x;
                val/=2;
            }
        }
        if(n<0)
        {
            ans=1.0/ans;
        }
        return ans;
    }
}