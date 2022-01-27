package com

import org.junit.*
import org.junit.Assert.*

class AssertionsUserAdultTest {


    // De tipo User
    private lateinit var bot: User
    private lateinit var juan: User


    @Before
    fun setup() {
        bot = User("64 bits", 1, false)
        juan = User("Juan", 18, true)
    }


    @After
    fun tearDown() {
        bot = User("")
        juan = User("")
    }

    @Test
    fun isAdult() {
        val assertions = Assertions()
        assertions.setLocation("ES")// LE DESIMOS QUE NO ES "US" SI NO ES
        assertTrue(assertions.isAdult(bot))
        assertTrue(assertions.isAdult(juan))
    }
}