package topics

fun main() {
    println(testSimple(4,8))
    println( testString(10))
    testNamedArguments(4,2,3);
    testNamedArguments(z = 4,x = 2, y = 3)
    testDefaultArguments();
    testDefaultArguments(y=1);
    testDefaultArguments(1,2);


    printEven(101,102,15,34,575,12,17,271)
    printEven(*intArrayOf(2,5,78,9,5),122,17,271)
}

fun testSimple(x:Int, y:Int) = x+y
fun testString(x:Int):String = "String is $x"

/*fun testNamedArguments(x:Int, y:Int, z:Int):List<Int> {
    return listOf(x, y, z)
}*/
fun testNamedArguments(x:Int, y:Int, z:Int) = listOf(x, y, z)

fun testDefaultArguments(x:Int = 1, y: Int = 2){
    println(x+y)
}

fun foo(name:String, number:Int=42, toUpperCase:Boolean=false){
    (if (toUpperCase)name.uppercase() else name)+number
}
//vararg

//fun printEven(list:List<Int>){
fun printEven(vararg numbers:Int){
    numbers.forEach { e-> if(e%2 ==0) println(e) }
}
