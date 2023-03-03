
data class CustomerKotlin(var id: Int, var name: String, var email: String) {

    override fun toString(): String {
        return "{ id: $id, name: $name, email: $email }"
    }
}