package topics

fun main() {
    testWhen(1)
    testWhen("Hello")
    testWhen(15)

}

fun testWhen(input: Any){
    //input.length


    when(input){
        1-> println("One")
        2-> println("Two")
        in 10..20 -> println("From10 to 20")
        is String -> println("Were inputted String ${input.length}")
        else -> println("Something else")
    }
}