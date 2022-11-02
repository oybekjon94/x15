package constructor

class Computer(
    var deviceName: String,
    var ram: String,
    var year: Int
)

fun main(){
    val a1 = Computer("DESKTOP-U3FV4T4","16.0 GB (15.8 GB usable)",2020)
    println("My computer device name is ${a1.deviceName} , ram is ${a1.ram} and ${a1.year}")
}