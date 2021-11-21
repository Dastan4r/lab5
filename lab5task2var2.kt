fun main () {
    calculateArray();
}

fun calculateArray () {
    var n = 1

    var arr = IntArray(50);
    arr[0] = n

    arr.mapIndexed { index, i -> if(index == 0) i else arr[index] = ((arr[index - 1] * 67 + 11) % 128) - 64}


}