package algo.lecture.sorting;

public class InsertionSort {

    public int[] sort(int[] toSort){
       for(int i=0; i < toSort.length; i++){
           for(int j=i; j >= 0; j--) {
               if(j != 0 && toSort[j] < toSort[j - 1]){
                   int temp = toSort[j];
                   toSort[j] = toSort[j - 1];
                   toSort[j - 1] = temp;
               }
           }
       }
       return toSort;
    }
}

// 2, 3, 1
//
