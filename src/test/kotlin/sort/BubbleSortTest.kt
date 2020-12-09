package sort

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class BubbleSortTest{

    val bubbleSort = BubbleSort()

    @Test
    fun `should sort a list of one element`() {
        val list = mutableListOf(3)
        val sorted = bubbleSort.sort(list)
        Assertions.assertEquals(listOf(3), sorted)
    }

    @Test
    fun `should sort a list of two element`() {
        val list = mutableListOf(3, 2)
        val sorted = bubbleSort.sort(list)
        Assertions.assertEquals(listOf(2, 3), sorted)
    }
}

