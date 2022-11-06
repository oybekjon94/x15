package enum

fun main(){
    val state = BendingMachineState.IDLE
    val message = when(state){
        BendingMachineState.IDLE -> "it's idle"
        BendingMachineState.RUNNING -> "it's runing"
        BendingMachineState.FINISHED -> "it's finished"
    }
    println(message)
}
enum class BendingMachineState{
    IDLE,
    RUNNING,
    FINISHED
}