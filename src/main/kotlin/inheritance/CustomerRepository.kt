package inheritance

import Customer

interface CustomerRepository  {
//    val isEmpty: Boolean = true // it will give error as property initialization is not allowed in interface because they cant maintain state.
    val isEmpty: Boolean
        get() = true
    fun store(obj: Customer) {
    }
    fun getById(id: Int) : Customer
}

class SQLCustomerRepository: CustomerRepository {
    override fun getById(id: Int): Customer {
        return Customer(id, "vivek", 1995)
    }

    override fun store(obj: Customer) {
        super.store(obj)
    }

    override val isEmpty: Boolean
        get() = false
}

interface Interface1 {
    fun funA() {
        println("Fun A from interface 1")
    }
}

interface Interface2 {
    fun funA() {
        println("Fun A from interface 2")
    }
}

class Class1And2: Interface1, Interface2 {
    override fun funA() {
        println("From class")
    }
}

fun main(args: Array<String>) {
    val c = Class1And2();
    c.funA()    
}