fun main () {
    calculateVar2Array();
}

fun calculateVar2Array () {
    var n = 2

    var arr = IntArray(50);
    arr[0] = n

    arr.mapIndexed { index, i -> if(index == 0) i else arr[index] = ((arr[index - 1] * 67 + 11) % 128) - 64}

    var result = 0;

    arr.forEach { if (it % 2 == 0) result += it else null }

    println("result $result")
}