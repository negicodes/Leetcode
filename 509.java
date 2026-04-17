class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        int a = 0;
        int b =1;
        int x;
        for(int i =2;i<=n;i++){

            x = a+b;
            a=b;
            b=x;
        }
        return b ;
    }
}
