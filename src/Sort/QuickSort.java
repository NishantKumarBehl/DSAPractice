package Sort;

public class QuickSort {

    
    public static void main(String[] args){
        int[] a = {8,13,2,23,19,20,6};
        int low = 0,high=a.length -1;
        quicksort(a,low,high);
        //print the sorted array
        for (int x : a)
            System.out.println(x + " ");
    }

    

}
