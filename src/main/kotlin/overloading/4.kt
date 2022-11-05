package overloading

// Overloading the function named Min
// The function finds the minimum value between different numbers of numbers.

// Between 2 numbers
fun Min(num1:Double, num2:Double):Double{
    if (num1<num2)
        return num1
    return num2
}

// Between 3 numbers
fun Min(num1: Double,num2: Double,num3:Double):Double{
    var min =  num1
    if (min>num2) min=num2
    if (min>num3) min=num3
    return min
}

// Between 4 numbers
fun Min(num1:Double, num2:Double, num3:Double, num4:Double):Double {
    var min = num1;
    if (min>num2) min = num2
    if (min>num3) min = num3
    if (min>num4) min = num4
    return min
}

// Between 5 numbers
fun Min(num1:Double, num2:Double, num3:Double,
        num4:Double, num5:Double):Double {
    var min = num1
    if (min>num2) min = num2
    if (min>num3) min = num3
    if (min>num4) min = num4
    if (min>num5) min = num5
    return min
}

fun main(args:Array<String>)
{
    // Demonstration of calling the Min function
    // 1. The Min() function with 2 parameters is called
    var min = Min(2.5, 3.8)
    println(min)

    // 2. Call the Min() function with 3 parameters
    min = Min(2.6, 3.8, 1.2)
    println(min)

    // 3. Call the Min() function with 3 parameters
    println(Min(1.7, 3.2, 0.8, -3.5))

    // 4. Call the Min() function with 3 parameters
    println(Min(7.2, 8.1, 6.5, 4.4, 2.8))
}