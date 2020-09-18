package edu.sostrovsky.myplantdiaryapp

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun addition_isIncorrect() {
        assertNotEquals(4, 2 + 3)
    }

    @Test
    fun addTwoAndThree_equalsFive() {
        assertEquals(5, 2+3)
    }

    @Test
    fun addThreeAndThree_equalsSix() {
        assertEquals(6, 3+3)
    }

    @Test
    fun addThreeAndFour_equalsSeven() {
        assertEquals(7, 3 + 4)
    }

    @Test
    fun addOneAndTwo_equalsFour() {
        assertEquals(4, 1 + 2)
    }
}
