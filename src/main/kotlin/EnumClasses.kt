
enum class Priority(val value: Int) {
    MINOR(-1){
        override fun text():String {
            return "[Minor priority]"
        }

        override fun toString(): String {
            return "Minor priority"
        }
             },
    NORMAL(0) {
        override fun text():String {
            TODO("Not yet implemented")
        }
    },
    MAJOR(1) {
        override fun text():String {
            TODO("Not yet implemented")
        }
    },
    CRITICAL(10) {
        override fun text():String {
            TODO("Not yet implemented")
        }
    };

    abstract fun text():String
}

fun main() {
    val priority = Priority.NORMAL
    println(priority) // NORMAL
//    println(priority.value) // 0
//    println(priority.ordinal) //1
//    println(Priority.CRITICAL.ordinal)//3

//    val priority =  Priority.MINOR
//    println(priority) //Minor priority
//    println(priority.text()) //[Minor priority]
}