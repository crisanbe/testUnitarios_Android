package com.example.fundamentosjunit

import com.Assertions
import com.User
import org.junit.*
import org.junit.Assert.*

class AssertionsUserAdultTest {

    // De tipo User
    private lateinit var bot: User
    private lateinit var juan: User

    //Rule, la solución a la herencia en Unit Test
    @get:Rule val locationESRule = LocationESRule()

    @Before
    fun setup() {
        bot = User("64 bits", 1, false)
        juan = User("Juan", 18, true)
        println("setup")
    }

    @After
    fun tearDown() {
        bot = User("")
        juan = User("")
        println("tearDown")
    }

    @Test
    fun isAdultTest() {
      /*  val assertions = Assertions()
        assertions.setLocation("ES")// LE DESIMOS QUE NO ES "US" SI NO ES
        assertTrue(assertions.isAdult(bot))
        assertTrue(assertions.isAdult(juan))*/
        assertEquals(true, locationESRule.assertions?.isAdult(juan))
        assertEquals(true, locationESRule.assertions?.isAdult(bot))
        println("isAdultTest")
    }
}