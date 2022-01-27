package com

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class AssertionsUsersTest {


    // De tipo User
    private lateinit var bot: User
    private lateinit var juan: User

    //todo @Before complemento para nuestras pruebas
    //Esta se va ejecutar antes de cada prueba
    //Una forma de declarar nuestras variable globales en nuestras pruebas uniterias
    // y de etsa forma hacer mas pequeños nuestros metodos, que compartan siertos elementos.
    @Before
    fun setup() {
        bot = User("64 bits", 1, false)
        juan = User("Juan", 18, true)
        println("Before")
    }

    //todo @After complemento para nuestras pruebas
    @After
    fun tearDown(){
        bot = User("64 bits", 1, false)
        juan = User("Juan", 18, true)
        println("After")
    }

    @Test//Nos aseguramos que todos los nombramientos terminen en Test
    fun checkHumanTest() {
        val assertions = Assertions()
        assertFalse(assertions.checkHuman(bot))
        assertTrue(assertions.checkHuman(juan))
        println("checkHuman")
    }

    //funcion validar que no es nulo (assertNotNull)
    @Test
    fun checkNotNullUserTest(){
        assertNotNull(juan)
        //prueba simple con assertNotNull.
        //----------------------
        //prueba instanciando el metodo checkHuman para validar que no es nulo
        val assertions = Assertions()
        assertNotNull(assertions.checkHuman(juan))
        println("checkNotNull")
    }

}