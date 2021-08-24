package Search;

public class IndexOfFirstOccurence {


    static int bsearch(int arr[],int low,int high, int x){

        int mid = (low+high)/2;

        while (low <= high){

           if (arr[mid] >x)
                return high = mid -1;
            else if (arr[mid] < x)
                return low = mid +1;
            else {
                if (arr[mid]==0 || arr[mid -1] != arr[mid])
                    return mid;
                else
                    return high = mid -1;

            }
        }

      return -1;
    }

    public static void main(String[] args) {
        int low =0;
        int high = 6;
        int arr[] = {10,20,30,40,50,60};
        int x =30;
        System.out.println(bsearch(arr,low,high,x));
    }


}
