package oop
//create the delegate class
import kotlin.reflect.KProperty

class LoggingDelegate {
    private var value: String = "Initial Value"

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        println("Getting value of '${property.name}': $value")
        return value
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, newValue: String) {
        println("Setting value of '${property.name}' to '$newValue'")
        value = newValue
    }
}

class MyClass {
    var name: String by LoggingDelegate()
}

fun main() {
    val myClass = MyClass()

    // Access the property
    println(myClass.name) // Triggers getValue

    // Change the property
    myClass.name = "Kotlin Delegation" // Triggers setValue

    // Access the property again
    println(myClass.name) // Triggers getValue
}