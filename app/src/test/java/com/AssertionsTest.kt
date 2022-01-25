package com

import org.junit.Assert.*
import org.junit.Test

class AssertionsTest{
    //con esta funcion vamos a verificar que la funcion
    // fun getLuckNumbers() de la clase Assertions este correta.
    //assertArrayEquals == verificar Arrays
    @Test
    fun getArrayTest(){
     val assertions = Assertions()
        val array = arrayOf(21, 117)//valor esperado
        //val array = arrayOf(21, 11)//valor esperado
        assertArrayEquals("Mensaje personalizado de error test",array, assertions.getLuckNumbers())
    }

    //assertEquals = si es igual al nombre por defecto
    // que se encuentra en la clase Assertions funcion getName() que es Cristian.
    //assertNotEquals = no es igual
    @Test
    fun getNameTest(){
        val assertions = Assertions()
        val name = "Cristian"
        val otroname = "Alain"
        assertEquals(name, assertions.getName())
        assertNotEquals(otroname, assertions.getName())
    }

    //Asserciones Booleanas
    //assertFalse y assertTrue
    @Test
    fun checkHumanTest(){
        val assertions = Assertions()
        val bot = User("64 bits",1, false )
        val juan = User("Juan",18, true )
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
    }

    //assertNull para verificar nulos
    //if (user == null) return null condicion de la Assetions funcion de checkHuman
    @Test
    fun checkNullUserTest(){
        val user = null
        assertNull(user)
        //prueba simple con assertNull.
        //----------------------
        //prueba instanciando el metodo checkHuman para validar nulos
        val assertions = Assertions()
        assertNull(assertions.checkHuman(user))
    }

    //funcion validar que no es nulo (assertNotNull)
    @Test
    fun checkNotNullUserTest(){
        val user = User("Juan",18)
        assertNotNull(user)
        //prueba simple con assertNotNull.
        //----------------------
        //prueba instanciando el metodo checkHuman para validar que no es nulo
        val assertions = Assertions()
        assertNotNull(assertions.checkHuman(user))
    }




}