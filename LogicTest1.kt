var listNum = mutableListOf<Any>()
var listOf7 = listOf(7, 14, 21, 28, 35, 42, 49, 56, 63, 70)

fun main() {
    print("Masukkan angka: ")
    var input: Int? = readLine()?.toInt()
    for (i in 1 until input!! + 1){
        val sum = i * 3
        listNum.add(sum)
    }
    for(index in listNum.indices){
        if(listNum[index] in listOf7){
            listNum[index] = "Z"
        }
    }
    print(listNum)
}
