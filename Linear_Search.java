
import java.util.Scanner;

public class Linear_Search {

    public static  void Linear_Search_algo(int arr[],int num_to_find){
        int i=0,flag=0;
        while(i<arr.length){
            if(arr[i]==num_to_find){
                flag=1;
                System.out.println("NUmber found");
            }
            i++;
        }
        if(flag==0){
            System.out.println("NUmber not found");
        }
    }

    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter Number of  Values : ");
            int a= sc.nextInt();
            System.out.println("Enter Values : ");
            int arr []= new int[a];
            for(int i=0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Enter number to find : ");
            int num_to_find = sc.nextInt();
            Linear_Search_algo(arr,num_to_find);
        }
    }
}

