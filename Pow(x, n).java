class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        long power=n;
        if(n<0){
            x=1/x;
            power=-power;
        }
        double result =1;
        while(power>0){
            if(power%2==1) result *=x;
            x*=x;
            power/=2;
        }
        return result;
    }
}