package com

import org.junit.Assert.*
import org.junit.Test

class AssertionsTest{
    //con esta funcion vamos a verificar que la funcion
    // fun getLuckNumbers() de la clase Assertions este correta.
    @Test
    fun getArrayTest(){
     val assertions = Assertions()
        val array = arrayOf(21, 117)//valor esperado
        //val array = arrayOf(21, 11)//valor esperado
        assertArrayEquals("Mensaje personalizado de error test",array, assertions.getLuckNumbers())
    }

    @Test
    fun getNameTest(){
        val assertions = Assertions()
        val name = "Cristian"
        val otroname = "Alain"
        assertEquals(name, assertions.getName())
        assertNotEquals(otroname, assertions.getName())
    }
    @Test
    fun checkHumanTest(){
        val assertions = Assertions()
        val bot = User("64 bits",1, false )
        val juan = User("Juan",18, true )
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
    }
}