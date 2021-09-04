package Search;

public class BinarySearchRecursive {

    static int bsearch(int[] arr,int low,int high, int x){

        
       int mid = (low + high)/2;

        if (low > high)
                return -1;

        if (arr[mid] == x) return mid;

        else if (arr[mid] > x)
             return   bsearch(arr,low,mid-1,x);

        else
             return   bsearch(arr, mid+1, high, x);

    }

    public static void main(String[] args) {
        int low = 0, high = 6,x =55, arr[] ={10,20,30,40,50,60};

        System.out.println((bsearch(arr,low,high,x)));
    }
}
   