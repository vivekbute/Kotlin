package inheritance

abstract class StoredEntity {
    val isActive = true
    abstract fun store()
    fun status() : String {
        return isActive.toString()
    }
}

class Employee: StoredEntity() {
    override fun store() {
        TODO("Not yet implemented")
    }

}

fun main(args: Array<String>) {
//    val se = StoredEntity // It will give error as we can not create instance of abstract class

    val se = Employee()
    se.isActive;
    println( se.status());
}