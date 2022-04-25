package topics

fun main() {
    var a: String = "Hello";
    //a = null // NPE excluded

    var b: String? = "Test"
    b = null

    //b.length

    ///b return b length, if null - null   no NPE
    b?.length

    //Elvis operator -  ?:
    val l = b?.length ?: -1

    b = if ((0..10).random() >5 ) "asdf" else null
    // !! operator - gives NPE if val contain null
    val t = b!!.length

}