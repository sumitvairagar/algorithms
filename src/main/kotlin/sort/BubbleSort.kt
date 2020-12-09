package sort

class BubbleSort {

    fun sort(list: MutableList<Int>): List<Int> {
        var swap = true
        while (swap){
            swap = false
            for (i in 0 until list.size - 1){
                if(list[i] > list[i + 1]){
                    val temp = list[i]
                    list[i] = list[ i+ 1]
                    list[i + 1] = temp
                }
            }
        }
        return list
    }
}