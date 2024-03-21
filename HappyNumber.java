class HappyNumber {
    public boolean isHappy(int n) {
        int sum=0;
        while(n>9) {
            sum=0;
            while(n!=0) {
                sum+=(n%10)*(n%10);
                n/=10;
            }
            n=sum;
        }
        if(n==1||n==7 ) return true;
        return false;
    }
}