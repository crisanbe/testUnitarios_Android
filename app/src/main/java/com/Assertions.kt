package com

class Assertions {
    private val user = User("Cristian", 32)

    fun getLuckNumbers(): Array<Int> {//retornamos un array de tipo entero
        return arrayOf(21, 117)
    }

    //averiguar el nombre del ususario que ya esta por defecto
    fun getName(): String {
        return user.name
    }


    fun checkHuman(user: User): Boolean {
        return user.isHuman
    }

    //esta funcion si el usuario = a nulo
    //suponer que hay una sobrecarga de metodos
    //? posiblemente sea null = que sera por defecto un nulo
    fun checkHuman(user: User? = null): Boolean? {
        if (user == null) return null
        //en caso de que no sea nulo
        //retornara por defecto un humano
        return user.isHuman

    }

    //funcion si adulto
    fun isAdult(user: User): Boolean {
        //si no es humano
        if (!user.isHuman) return true

        //en caso de que no se alique !user.isHuman se retornar por defecto ususario mayor o igual a 18
        return user.age >= 18
    }


}