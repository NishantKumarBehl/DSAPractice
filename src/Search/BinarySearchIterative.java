package Search;

public class BinarySearchIterative

{
     static int bsearch(int arr[], int n, int x)
    {
        int high = n-1;
        int low = 0;


        while ( low <= high){

            int mid =  (high+low) /2;

            if (arr[mid] == x)
                return mid;
            else if (arr[mid] < x)
                    low = mid +1;
            else
                    high =   high -1;
        }

        return  -1;
    }

    public static void main(String[] args) {

         int arr[] = {10,20,30,40,50,60};
         int n =6;
         int x =25;

        System.out.println("Value found " + bsearch(arr,n,x));

    }
}
