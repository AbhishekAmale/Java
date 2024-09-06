public class recurssion_que {
    static int sum=0;
    public static void main(String[] args) {
        reverse_num(10121212);
        System.out.println(sum);
    }
    //factorial
    static  int facto(int n ){
        if(n<2){
            return 1;
        }
        return n*facto(n-1);
    }
    //sum of digit
    static int sumofdigit(int n){
        if (n==0){
            return 0;
        }
        return (n%10)+sumofdigit(n/10);

    }
    static int reverse_num(int n){
        int ans=0;
        if(n==0){
            return ans;
        }
        ans=n%10;
        n=n/10;
        sum=sum*10+ans;
        return reverse_num(n);
        }
}
