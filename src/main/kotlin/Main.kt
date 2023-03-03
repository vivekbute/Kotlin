fun main(args: Array<String>) {
//    val customer = Customer(10, "Vivek", 1993)
//    val customer2 = Customer(10)
//    customer.id
//    customer.name

//    customer.socialSecurityNumber = "SN1234"
//    println(customer.name)
//    println(customer.age)
//    println(customer.socialSecurityNumber)
//
//    println(customer.customerAsString())

    val customer1 = CustomerKotlin(1, "Vivek", "vivek@gmail.com")

    val customer2 = CustomerKotlin(1, "Vivek", "vivek@gmail.com")

    val customer3 = customer1

//    println(customer1)

//    if (customer1 == customer2) {
//        println("They are same")
//    }
//    println(customer3)
//    val customer4 = customer1.copy(email = "vivektest@gmail.com")
//    println(customer4.id)
//    println(customer4.name)
//    println(customer4.email)

    println(customer1)
}