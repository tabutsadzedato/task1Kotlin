fun main() {
    val sia1 = arrayOf(1,2,3,4,5,6,7,8,9,10)
    funqcia1(sia1)
    palindromi("daad")
}

fun funqcia1(sia : Array<Int>): Int {
    var sum = 0
    var count = 0
    for(i in sia.indices){
        if(i%2==0){
            sum += sia[i]
            count++
        }
    }
    println(sum/count)
    return sum/count
}


fun palindromi(sitkva: String) {
    var reverseSitkva = ""
    var sigrdze = sitkva.length
    for (i in (sigrdze - 1) downTo 0) {
        reverseSitkva = reverseSitkva + sitkva[i]
    }
    if (sitkva.equals(reverseSitkva, ignoreCase = true)) {
        println("String is Palindrome")
    } else {
        println("String is NOT a Palindrome")
    }
}