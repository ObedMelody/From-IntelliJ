import java.util.*

fun main(){
    val names = listOf("Obed", "Francis", "Miracle", "Mary", "Grace", "Chukwunenye", "Nelson")
    val filterName = names.filter {
        it.lowercase(Locale.getDefault()).contains("")
    }
    println(filterName)

    val age:List<Int> = listOf(
        3,4,10,11,16,15,77,
        42,9,18,17,12,19,32,
        13,4,7,93,45,34,22,
        32,20,34, 52,53,72,
        23,24,25,54,14,16,4
    )

/*    val greaterThan20  =
        age.filter {
        it >= 20
        }
    println(greaterThan20)
    */
   // achieving the above the with function

    val isAdult = age.filter {
        isGreaterThan18(it)
    }
    println("These are greater than 18 $isAdult")

    val isMinor = age.filter {
        isLessThan18(it)
    }
    println("These are less than 18 $isMinor")

    val isFound  = isIn(names)
    println(isFound)
}

fun isGreaterThan18(value: Int):Boolean{
    return value>18
}

fun isLessThan18(value: Int): Boolean {
        return value<18
}
fun isIn(value: List<String>): String {
    for (x in value){
        if ("a" in value){
            println(value)
        }
    }
     return value.toString()
}