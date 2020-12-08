package search

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import search.BinarySearch


class BinarySearchTest{

    val binarySearch = BinarySearch()

    @Test
    fun `should return -1 if list has zero element`() {
        val empty = emptyList<Int>()
        Assertions.assertEquals(-1, binarySearch.binarySearch(empty, 1))
    }


    @Test
    fun `should return index if list has only one element`() {
        val empty = listOf(1)
        Assertions.assertEquals(0, binarySearch.binarySearch(empty, 1))
    }

    @Test
    fun `should search the number in the list`() {
        val sorted = listOf(3, 6, 8, 10, 14, 19, 23, 30)
        val result = binarySearch.binarySearch(sorted, 10)
        Assertions.assertNotNull(result)
        Assertions.assertEquals(3, result)
    }

    @Test
    fun `should search the number in the bigger list`() {
        val sorted = listOf(3, 6, 8, 10, 14, 19, 23, 30, 32, 33, 45, 65, 67, 70, 71)
        val result = binarySearch.binarySearch(sorted, 45)
        Assertions.assertNotNull(result)
        Assertions.assertEquals(10, result)
    }
}