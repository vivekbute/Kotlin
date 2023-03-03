import java.util.*

class Customer(val initId: Int, var name: String, val yearOfBirth: Int) {
    val age: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""
        set(value) {
            if (!value.startsWith("SN")) {
                throw IllegalArgumentException("Social security should start with SN")
            }
            // field is special recognized value in kotlin and it's referring to that backing field
            field = value
        }

    fun customerAsString(): String {
        return "Id: $initId - Name: $name - Year Of Birth: $yearOfBirth"
    }
}