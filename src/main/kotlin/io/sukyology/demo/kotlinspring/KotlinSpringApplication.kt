package io.sukyology.demo.kotlinspring

import io.sukyology.demo.kotlinspring.pojo.ClassWithDelegate
import io.sukyology.demo.kotlinspring.pojo.MyClass
import io.sukyology.demo.kotlinspring.pojo.extDelegated
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringApplication

fun main(args: Array<String>) {
    println(MyClass(5, ClassWithDelegate(7)).extDelegated)
    runApplication<KotlinSpringApplication>(*args)
}
