import java.util.Scanner;

public class Binary_Search {

    public static int Binary (int []arr,int element){
        int low=0;
        int high = arr.length - 1;
        int mid;
        while(low <= high ){
            mid = (low + high ) / 2;
            if(arr[mid]==element){
                return mid;
            }
            else if (element > arr[mid]) {
                low = mid + 1;
            }
            else if(element < arr[mid] ){
                high = mid-1;
            }
        }
        return -1;
    }
    static int Ceiling(int [] arr,int target){
        int  low=0;
        int high = arr.length-1;
        int mid;
        while(low <= high){
             mid = (low + high)/2;
             if(arr[mid]==target){
                return mid;
             }
             else if(target > arr[mid]){
                low = mid + 1;
             }
             else if(target < arr[mid]){
                high = mid - 1;
             }
        }

        return low;
    }
    static int floor(int [] arr,int target){
        int  low=0;
        int high = arr.length-1;
        int mid=0;
        while(low <= high){
             mid = (low + high)/2;
             //System.out.println("low = "+low+"high="+high+"mid = "+mid);
             if(arr[mid]==target){
                return mid;
             }
             else if(target > arr[mid]){
                low = mid + 1;
             }
             else if(target < arr[mid]){
                high = mid - 1;
             }
            

        }
        //System.out.println("low = "+low+"high="+high+"mid = "+mid);
        return high;
    }
    static int Mountain(int []arr){
        int mid=0,low=0,high=arr.length-1;
        while(low<high){
            mid= low + (high - low)/2;
            //System.out.println("low = "+low+"high="+high+"mid = "+mid);
            if(arr[mid] > arr[mid+1])
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            // System.out.println("Enter Number of  Values : ");
            // int a= sc.nextInt();
            // System.out.println("Enter Values : ");
            // int arr []= new int[a];
            // for(int i=0;i<arr.length;i++){
            //     arr[i] = sc.nextInt();
            // }
            // System.out.println("Enter number to find : ");
            // int num_to_find = sc.nextInt();


            //*******************for binary search  ************************ */
        //    int result =  Binary(arr,num_to_find);
        //    if(result == -1){
        //     System.out.println("Element not found");
        //    }
        //    else{
        //     System.out.println("Element found");
        //    }

        //*****************************for ceiling problem*********************** */
        // int result =  Ceiling(arr,num_to_find);
        //    if(arr.length != result){
        //     System.out.println("ceiling found :"+arr[result]);
        //    }
        //    else{
        //     System.out.println("ceiling not found ");
        //    }


        //*****************************for floor problem*********************** */
        // int result =  floor(arr,num_to_find);
        //    if( result > -1){
        //     System.out.println("floor found :"+arr[result]);
        //    }
        //    else{
        //     System.out.println("floor not found ");
        //    }


        //*****************************mountain array problem *********************/
        int []arr={1,2,3,4,5,3,1};
        int result =  Mountain(arr);
        System.out.println("Biggest elemnt in array is : "+arr[result]);
        
        
        
        sc.close();
        }

    }
}
