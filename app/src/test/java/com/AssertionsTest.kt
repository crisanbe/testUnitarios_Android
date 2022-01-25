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
        assertArrayEquals(array, assertions.getLuckNumbers())
    }
}