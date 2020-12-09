package search

class BinarySearch {

    fun binarySearch(sorted: List<Int>, i: Int): Int? {
        if (sorted.isEmpty()) return -1

        var low = 0
        var high = sorted.size - 1

        while (low <= high){
            val mid = (low + high) / 2
            if(sorted[mid] > i){
                high = mid -1
            }
            else if(sorted[mid] < i){
               low = mid + 1
            }else{
                return mid
            }
        }
        return -1
    }
}