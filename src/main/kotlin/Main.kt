fun main(args: Array<String>) {
    val customer = Customer(10, "Vivek", 1993)
//    val customer2 = Customer(10)
//    customer.id
//    customer.name

    customer.socialSecurityNumber = "SN1234"
    println(customer.name)
    println(customer.age)
    println(customer.socialSecurityNumber)

    println(customer.customerAsString())
}