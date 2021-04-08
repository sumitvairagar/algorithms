package algo.lecture.sorting;

public class SelectionSort {
    public int[] sort(int[] toSort){
       for(int i=0; i < toSort.length; i++){
           for(int j=i; j < toSort.length; j++){
               if(toSort[i] > toSort[j]){
                   int temp = toSort[i];
                   toSort[i] = toSort[j];
                   toSort[j] = temp;
               }
           }
       }
       return toSort;
    }
}

// 2, 3, 1
//
