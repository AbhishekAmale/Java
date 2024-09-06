

public class pat {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println("----------------------------------------");
        pattern2(4);
        System.out.println("----------------------------------------");
        pattern3(4);
        
        System.out.println("----------------------------------------");
        pattern4(4);
        System.out.println("----------------------------------------");
        pattern5(4);
        System.out.println("----------------------------------------");
        pattern6(4);
    }

    public static void pattern1(int n){
        for(int row = 1 ; row <= n ;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void pattern2(int n){
        for(int row = n ; row > 0 ;row--){
            for(int col=row;col>0;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        int num=1;
        for(int row = 1 ; row <= n ;row++){
            for(int col=1;col<=row;col++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int row = 1 ; row <= n ;row++){
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    
        for(int row = n ; row > 0 ;row--){
            for(int col=row;col>0;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        // int count=n;
        // for(int row = 1 ; row <= n ;row++){
        //     for(int bl=count;bl>0;bl--)
        //     {
        //         System.out.print(" ");
        //     }
        //     count--;
        //     for(int col=1;col<=row;col++){
        //         System.out.print("*");
        //     }
            
        //     System.out.println();
        // }
        System.out.println("""
                               *\r
                              **\r
                             ***\r
                            ****""");
    }
}
