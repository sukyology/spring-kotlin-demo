package io.sukyology.demo.kotlinspring.pojo

import kotlin.properties.PropertyDelegateProvider
import kotlin.properties.ReadOnlyProperty

var topLevelInt: Int = 0

class ClassWithDelegate(val anotherClassInt: Int)
class MyClass(var memberInt: Int, val anotherClassInstance: ClassWithDelegate) {
    var delegatedToMember: Int by this::memberInt
    var delegatedToTopLevel: Int by ::topLevelInt

    val delegatedToAnotherClass: Int by anotherClassInstance::anotherClassInt
}


val provider = PropertyDelegateProvider { thisRef: Any?, property ->
    println(thisRef)
    ReadOnlyProperty<Any?, Int> {_, property ->
        println(property)
        42 }
}

val MyClass.extDelegated: Int by provider
