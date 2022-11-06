package enum

fun main(){
    val day2 = DAYS2.SATURDAY
    println(day2.doWork())
}

interface Work{
    fun doWork()
}
enum class DAYS2(val isWeekend:  Boolean = false): Work{
    Monday(true){
        override fun doWork(){
            println("I work")
        }
    },
    TUESDAY{
        override fun doWork(){
            println("I work")
        }
    },
    WEDNESDAY{
        override fun doWork(){
            println("I work")
        }
    },
    THURSDAY{
        override fun doWork(){
            println("I work")
        }
    },
    FRIDAY{
        override fun doWork(){
            println("I work")
        }
    },
    SATURDAY{
        override fun doWork(){
            println("today is weekend so I don't work")
        }
    },
    SUNDAY(true){
        override fun doWork(){
            println("today is weekend so I don't work")
        }
    };
    companion object{
        fun isWeekend(days2: DAYS2) = days2.name == SUNDAY.name || days2.name == SATURDAY.name
    }
}