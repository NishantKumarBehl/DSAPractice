package Sort;

public class QuickSort {

    
    public static void main(String[] args){
        int[] a = {8,13,2,23,19,20,6};
        int low = 0,high=a.length -1;
        quicksort(a,low,high);
        //print the sorted array
        for (int x : a)
            System.out.print(x + " ");
    }


    static int partition(int[] a , int l, int h){

        //set the indexes and pivots
        int pivot = a[l];
       int i = l-1;
       int j = h+1;
        
        while (true){

            //increment counter till you find number greater than pivot value
            do{
                i++;
            } while(a[i] < pivot );
            // decrement counter till you find number less than pivot value
            do{
                j--;
            } while (a[j] > pivot);

            // when i and j have crossed each other
            if(i>=j)
                return j;

            //swap the elements when above have found an element that is 
            //larger than pivot on left side and an element that is small than pivot on right side
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

        }

    }

    static void quicksort(int[] a , int l, int h){

        //check if there are two elements present
        if (l < h) {
        //Obtain the partition point
        int p = partition(a,l,h);
        //tail recursive calls with partitioned arrays
        quicksort(a, l, p);
        quicksort(a, p+1, h);
        }
    }

}
