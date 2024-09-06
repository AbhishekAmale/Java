public class array_que_recurssion {

//check array is sorted or not
    static boolean arraysorted(int arr[],int position)
    {
        if(arr.length-1==position){
            return true;
        }

        return arr[position]<arr[position+1] && arraysorted(arr, position+1);
    }



    //linear search with recurssion
    static boolean linearSearch(int arr[],int position,int key)
    {
        if(-1==position){
            return false;
        }

        return arr[position]==key || linearSearch(arr, position-1,key);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,7,8,9};
        boolean val = linearSearch(arr, arr.length-1, 4);
        if(val){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
