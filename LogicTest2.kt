val listHewan = listOf("gajah", "serigala", "harimau")
var cerita = listOf<String>()
var checkHewan = mutableListOf<String>()

fun main(args: Array<String>) {
    print("Masukkan kisah: ")
    val input = readLine()?.lowercase()
    cerita = input?.split(" ")!!
    cerita.forEach{hewan ->
        if(hewan in listHewan){
            checkHewan.add(hewan)
        }
    }
    println(checkHewan)
}
