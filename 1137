LeetCode 1137 — N-th Tribonacci Number

class Solution {
    public int tribonacci(int n) {
        if(n == 0){
            return 0;
        }
        else if (n == 1 ){
            return 1;

        }
        else if(n==2){
            return 1;
        }
        int a =0;
        int b = 1;
        int c = 1;
        for(int i =3; i<=n ;i++){
            int x = a+b+c;
            a = b;
            b = c;
            c = x;
            System.out.print(c);
            
        }
        return c;
    }
}
