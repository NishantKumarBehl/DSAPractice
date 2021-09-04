package Sort;

public class MergeSort {

    //Define the calling function

    public static void main(String[] args) {
        //Initialize  the variables
        int arr[] = new int[]{10,7,23,5,19};
        int l =0, r=4;
        
        // call the mergsort function to sort the values
        mergesort(arr,l,r);

        //print the sorted values
        for (int x : arr)
            System.out.print(x + " ");
        
    }
        //Define the sort and merge function
        static void merge(int a[], int l, int m, int h){

            //Calculate the size of array
            int leftlen = m-l+1;
            int rightlen = h-m; 

            // Initialize left and right arrays with calculated array size
            int[] left = new int[leftlen];
            int[] right = new int[rightlen];

            // fill the values in left and right array
            for (int i=0;i<leftlen;i++){
                left[i] = a[i+l];
            }
            for (int j =0;j<rightlen;j++){
                right[j] = a[m + 1 + j];
            }

            // perform sorting and construct the final array
            int k=l, i=0,j=0;
            while (i < leftlen && j < rightlen){
                if (left[i] < right[j]){
                    a[k++] = left[i++];
                    }
                else a[k++] = right[j++];
            }

            // populate the pending elements
            while(i < leftlen)
                a[k++] = left[i++];
            
            while (j < rightlen)
                a[k++] = right[j++];


        }


        //Define the mergesort recursive method
        static void mergesort(int[] a, int l, int r){
            //get the middle point
            int m = l +(r-l)/2;
            //check if right index is bigger
            if (r>l)
            {
            //recursive call mergesort with low = l ,max = mid
            mergesort(a, l, m);
            //recursive call mergesort with low = m+1 and max = r
            mergesort(a, m+1, r);
            //merge divided arrays with sort by calling mergesort function
            merge(a,l,m,r);
        }
        }

    

}