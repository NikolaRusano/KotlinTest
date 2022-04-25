package topics

fun main() {
    val items = listOf("apple","banana","orange");
    mutableListOf("apple","banana","orange");

    for(item in items){
        println(item)
    }

    var index = 0;
    while (index < items.size){
        println("Items at $index is ${items[index]}");
        index++;
    }

    println(5 in 3..10)

    //diapasons

    for (i in 1..10)
        println(i)

    println("\n")

    for (i in 1 until 10)
        println(i)

    println("\n")


    for (i in 10 downTo  1)
        println(i)

    println("\n")

    for (i in 1..100 step 10)
        println(i)


}