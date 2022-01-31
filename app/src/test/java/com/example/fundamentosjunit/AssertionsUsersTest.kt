package com.example.fundamentosjunit

import com.Assertions
import com.User
import org.junit.*
import org.junit.Assert.*

class AssertionsUsersTest {

    // De tipo User
    private lateinit var bot: User


    companion object {
        private lateinit var juan: User

        //todo @BeforeClass complemento para nuestras pruebas quedaria al inicia y de todas las prubas.
        @BeforeClass
        @JvmStatic
        fun setupCommon() {
            juan = User("Juan", 18, true)
            println("BeforeClass")
        }

        //todo @AfterClass complemento para nuestras pruebas quedaria despues que se ejecute todas las prubas
        @AfterClass
        @JvmStatic
        fun tearDownCommon() {
            juan = User("Juan", 18, true)
            println("AfterClass")
        }

    }

    //todo @Before complemento para nuestras pruebas
    //Esta se va ejecutar antes de cada prueba
    //Una forma de declarar nuestras variable globales en nuestras pruebas uniterias
    // y de etsa forma hacer mas pequeños nuestros metodos, que compartan siertos elementos.
    @Before
    fun setup() {
        bot = User("64 bits", 1, false)
        println("Before")
    }

    //todo @After complemento para nuestras pruebas
    @After
    fun tearDown() {
        bot = User("64 bits", 1, false)
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
    fun checkNotNullUserTest() {
        assertNotNull(juan)
        //prueba simple con assertNotNull.
        //----------------------
        //prueba instanciando el metodo checkHuman para validar que no es nulo
        val assertions = Assertions()
        assertNotNull(assertions.checkHuman(juan))
        println("checkNotNull")
    }

    //no es igual
    @Test
    fun checkNotSameTest() {
        val juan = User("8bit", 1, false)
        val arturo = User("Juan", 18, true)
        assertNotSame(juan, arturo)
        println("checkNotSame")
    }

    //Es igual
    @Test
    fun checkSameTest() {
        val juan = User("8bit", 1, false)
        val ju = User("8bit", 1, false)
        val copiJuan = juan
        assertSame(juan, copiJuan)
        println("checkSame")
    }

}