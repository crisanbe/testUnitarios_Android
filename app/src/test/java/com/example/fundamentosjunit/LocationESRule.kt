package com.example.fundamentosjunit

import com.Assertions
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

//Rule, la solución a la herencia en Unit Test
class LocationESRule : TestRule {
    var assertions: Assertions? = null

    override fun apply(base: Statement?, description: Description?): Statement {
        return object : Statement(){
            override fun evaluate() {
                assertions = Assertions()
                assertions?.setLocation("ES")
                try {
                    base?.evaluate()
                    println("LocationESRule")
                } finally {
                    assertions = null
                }
            }
        }
    }
}