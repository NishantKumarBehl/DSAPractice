package Sort;
import java.util.*;

public class MergeSort {

    //Code the calling function

        public  static void main (String[] args) {
             int arr[] = {18,5,14,30,9}; 
             int l =0, r=4;

            mergsort(arr,l,r);

            //print the output
            for (int x : arr)
                System.out.println(x + " ");

        }

        static void merge(int arr[], int l, int m, int k){

            
        }

        // Define mergsort method\function

        static void mergsort(int a[], int l, int r) {
                if (r > l){
                    int m = (r-l)/2;
                    mergsort(a, l, m);
                    mergsort(a, m+1, r);
                    merge(arr,l,m,r)

                }

        }

    

}